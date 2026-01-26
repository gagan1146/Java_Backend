package com.Autowiring.JavaBased.MainConfigurationFile;

import com.Autowiring.JavaBased.configurationFiles.JavaConfigurationFiles;
import com.Autowiring.JavaBased.pojo.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainConfigurationFile {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigurationFiles.class);
        Account account = (Account) context.getBean("Account1");
        System.out.println(account);
    }
}