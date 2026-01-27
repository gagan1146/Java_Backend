package org.gagan.learningspringbeanlifecycle.BeanLifeCycle;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Account {
    private String branchName;
    private String pinCode;
    private User userData;

    public Account(@Value("${account.branchName}") String branchName,
                   @Value("${account.pinCode}") String pinCode,
                   User userData) {
        this.branchName = branchName;
        this.pinCode = pinCode;
        this.userData = userData;
    }
}
