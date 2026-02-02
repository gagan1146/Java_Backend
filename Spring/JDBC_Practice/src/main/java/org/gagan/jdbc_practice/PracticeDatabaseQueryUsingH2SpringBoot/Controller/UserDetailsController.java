package org.gagan.jdbc_practice.PracticeDatabaseQueryUsingH2SpringBoot.Controller;

import org.gagan.jdbc_practice.PracticeDatabaseQueryUsingH2SpringBoot.entity.UserDetails;
import org.gagan.jdbc_practice.PracticeDatabaseQueryUsingH2SpringBoot.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/h2/api/")
public class UserDetailsController {
    @Autowired
    private UserDetailsService userDetailsService;
    @GetMapping(path="/test-jpa")
    public List<UserDetails> getUser(){
        UserDetails userDetails = new UserDetails("Rock","rock@gmail.com");
        userDetailsService.addUser(userDetails);
        return userDetailsService.getUsers();
    }
    public UserDetails findById(Long id){
        return userDetailsService.findById(id);
    }
}
