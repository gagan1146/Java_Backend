package org.gagan.todoapplication.service;

import jakarta.validation.constraints.NotBlank;
import org.gagan.todoapplication.config.PasswordEncoder;
import org.gagan.todoapplication.entity.User;
import org.gagan.todoapplication.repository.UserRepository;
import org.gagan.todoapplication.service.OtpPurpose;
import org.gagan.todoapplication.service.OtpService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final OtpService otpService;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository,
                       OtpService otpService,
                       PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.otpService = otpService;
        this.passwordEncoder = passwordEncoder;
    }

    public void resetPassword(String email, String newPassword) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));

        user.setPassword(passwordEncoder(newPassword));
        userRepository.save(user);
    }

    private @NotBlank(message="Password should not be blank") String passwordEncoder(String newPassword) {
        return newPassword;
    }

    public void forgotPassword(String email) {
        userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));

        otpService.generateOtp(email, OtpPurpose.FORGOT_PASSWORD);
    }

    public void enableUserAfterOtpVerification(String email) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));

        user.setEnabled(true);
        userRepository.save(user);
    }
}