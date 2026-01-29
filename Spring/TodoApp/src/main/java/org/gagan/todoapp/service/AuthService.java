package org.gagan.todoapp.service;

import org.gagan.todoapp.model.User;
import org.gagan.todoapp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AuthService {
    public String signup(String username, String password){
        for(User user: UserRepository.users.values()){
            if(user.getUsername().equals(username)){
                throw new RuntimeException("User Already Signed up..");
            }
        }

        String userId = UUID.randomUUID().toString();
        User user = new User(userId,username,password);
        UserRepository.users.put(userId,user);
        UserRepository.userTodos.put(userId,new java.util.ArrayList<>());
        return userId;
    }
    public String login(String username, String password){
        for(User user: UserRepository.users.values()){
            if(user.getUsername().equals(username) && user.getPassword().equals(password){
                return user.getUserId();
            }
        }
        throw new RuntimeException("Invalid Credentials..");
    }
}
