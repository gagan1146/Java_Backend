package org.gagan.todoapplication.services;

import org.gagan.todoapplication.models.UserModel;
import org.gagan.todoapplication.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserServices implements UserDetailsService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServices(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public ResponseEntity<?> login(UserModel userModel){
        UserModel user = userRepository.findById(userModel.getEmail()).orElse(null);
        if(user != null){
            if(passwordEncoder.matches(userModel.getPassword(), user.getPassword())){
                return new ResponseEntity<>(user, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Invalid password", HttpStatus.UNAUTHORIZED);
            }
        }
        return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<?> signup(UserModel userModel){
        if(userRepository.existsById(userModel.getEmail())){
            return new ResponseEntity<>("Email already registered", HttpStatus.CONFLICT);
        }
        userModel.setPassword(passwordEncoder.encode(userModel.getPassword()));
        UserModel savedUser = userRepository.save(userModel);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserModel user = userRepository.findById(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return new User(
                user.getEmail(),
                user.getPassword(),
                Collections.emptyList()
        );
    }
}