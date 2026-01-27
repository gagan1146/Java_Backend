package com.Autowiring.JavaBased.configurationFiles;

import com.Autowiring.JavaBased.pojo.Account;
import com.Autowiring.JavaBased.pojo.Address;
import com.Autowiring.JavaBased.pojo.ParentalInformation;
import com.Autowiring.JavaBased.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class JavaConfigurationFiles {

    // 🔹 Autowire beans with qualifiers to avoid ambiguity
    @Autowired
    @Qualifier("Address1")
    private Address address1;

    @Autowired
    @Qualifier("Address2")
    private Address address2;

    @Autowired
    @Qualifier("parentalInformation1")
    private ParentalInformation parentalInformation1;

    @Autowired
    @Qualifier("parentalInformation2")
    private ParentalInformation parentalInformation2;

    // 🔹 Define beans
    @Bean(name = "parentalInformation1")
    public ParentalInformation parentalInformation1() {
        ParentalInformation parentalInformation = new ParentalInformation();
        parentalInformation.setFatherAadharNumber("999999999999");
        parentalInformation.setFatherAge(50);
        parentalInformation.setFatherName("Rock Lesner");
        parentalInformation.setMotherAge(50);
        parentalInformation.setMotherName("MotherNameHere");
        parentalInformation.setMotherAadharNumber("090909090909");
        return parentalInformation;
    }

    @Bean(name = "parentalInformation2")
    public ParentalInformation parentalInformation2() {
        ParentalInformation parentalInformation = new ParentalInformation();
        parentalInformation.setFatherAadharNumber("990000000000");
        parentalInformation.setFatherAge(58);
        parentalInformation.setFatherName("Rohan");
        parentalInformation.setMotherAge(58);
        parentalInformation.setMotherName("MotherNameHere");
        parentalInformation.setMotherAadharNumber("384923829323");
        return parentalInformation;
    }

    @Bean(name = "Address1")
    public Address Address1() {
        Address address = new Address();
        address.setArea("Sector-10");
        address.setCity("Haryana");
        address.setPincode("212121");
        return address;
    }

    @Bean(name = "Address2")
    public Address Address2() {
        Address address = new Address();
        address.setArea("Sector-101");
        address.setCity("Haryana");
        address.setPincode("212135");
        return address;
    }

    // 🔹 Users beans now use autowired fields
    @Bean
    public Users User1() {
        Users user = new Users();
        user.setAge(20);
        user.setAadharNumber("909090909090");
        user.setImage("urlForImageHere");
        user.setPANNumber("SSSSS99999");
        user.setAddress(address1);                  // injected via @Autowired
        user.setParentalInformation(parentalInformation1); // injected via @Autowired
        user.setUsername("John");
        return user;
    }

    @Bean
    public Users User2() {
        Users user = new Users();
        user.setAge(20);
        user.setAadharNumber("768756565687");
        user.setImage("urlForImageHere");
        user.setPANNumber("POUYO836383");
        user.setAddress(address2);                  // injected via @Autowired
        user.setParentalInformation(parentalInformation2); // injected via @Autowired
        user.setUsername("John");
        return user;
    }

    @Bean
    public List<Users> UsersList() {
        List<Users> users = new ArrayList<>();
        users.add(User1());
        users.add(User2());
        return users;
    }

    @Bean(name = "Account1")
    public Account Account1() {
        Account account = new Account();
        account.setBranchAddress("Badshahpur");
        account.setBranchCode("20322");
        account.setBranchName("BankNameHere");
        account.setUsers(UsersList());
        return account;
    }
}