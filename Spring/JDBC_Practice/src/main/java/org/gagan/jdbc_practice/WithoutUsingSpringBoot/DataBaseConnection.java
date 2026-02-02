package org.gagan.jdbc_practice.WithoutUsingSpringBoot;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
    public Connection getConnection(){
        try{
            Class.forName("org.h2.Driver");
            return DriverManager.getConnection("jdbc:h2:mem:userDB","sa","");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}
