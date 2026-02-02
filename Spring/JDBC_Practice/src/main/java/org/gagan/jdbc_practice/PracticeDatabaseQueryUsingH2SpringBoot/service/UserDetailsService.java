package org.gagan.jdbc_practice.PracticeDatabaseQueryUsingH2SpringBoot.service;

import org.gagan.jdbc_practice.PracticeDatabaseQueryUsingH2SpringBoot.Repository.UserDetailsRepository;
import org.gagan.jdbc_practice.PracticeDatabaseQueryUsingH2SpringBoot.entity.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDetailsService {
    @Autowired
    private UserDetailsRepository userDetailsRepository;
    public void addUser(UserDetails user){
        userDetailsRepository.save(user);
    }
    public List<UserDetails> getUsers(){
        return userDetailsRepository.findAll();
    }

    public UserDetails findById(Long id){
        if(userDetailsRepository.findById(id).isPresent()){
            return userDetailsRepository.findById(id).get();
        }
        return null;
    }
}
