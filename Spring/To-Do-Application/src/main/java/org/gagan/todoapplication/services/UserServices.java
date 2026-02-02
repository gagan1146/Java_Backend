package org.gagan.todoapplication.services;
import org.gagan.todoapplication.models.UserModel;
import org.gagan.todoapplication.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class UserServices {
    private final UserRepository userRepository;
    private final PasswordEncoder getPasswordEncoder;

    public UserServices(UserRepository userRepository, PasswordEncoder getPasswordEncoder) {
        this.userRepository = userRepository;
        this.getPasswordEncoder = getPasswordEncoder;
    }
    public List<UserModel> getUsers(){
        return userRepository.findAll();
    }
    public ResponseEntity<?> checkCredentials(UserModel userModel){
        List<UserModel> users = new ArrayList<>();
        users = getUsers();
        for(UserModel user : users){
            if(Objects.equals(userModel.getEmail(), user.getEmail())){
                String pass1 = user.getPassword();
                String pass2 = userModel.getPassword();
                if(getPasswordEncoder.encode(pass1).equals(pass2)){
                    return new ResponseEntity<>(user, HttpStatus.OK);
                }
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

//    public ResponseEntity<?>

}
