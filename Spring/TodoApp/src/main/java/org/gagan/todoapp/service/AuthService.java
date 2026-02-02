package org.gagan.todoapp.service;

import org.gagan.todoapp.model.User;
import org.gagan.todoapp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AuthService {
    public String signup(String username, String password,String contact,String secret){
        for(User user: UserRepository.users.values()){
            if(user.getUsername().equals(username)){
                throw new RuntimeException("User Already Signed up..");
            }
        }

        User user = new User(username,password,contact,secret);
        UserRepository.users.put(username,user);
        UserRepository.userTodos.put(username,new java.util.ArrayList<>());
        return username;
    }
    public String login(String username, String password){
        for(User user: UserRepository.users.values()){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user.getUsername();
            }
        }
        throw new RuntimeException("Invalid Credentials..");
    }
}
