package org.example.Java8.DateTime.LocalDateTime;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    static void main(String[] args) {
        LocalDateTime currentLocalDateTime = LocalDateTime.now();
        LocalDateTime customDateTime = LocalDateTime.parse("2026-01-23T09:00:50.350");
        System.out.println(currentLocalDateTime);
        System.out.println(customDateTime);
    }
}
