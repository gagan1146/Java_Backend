package org.example.Java8.DateTime.LocalDate;

import java.time.LocalDate;

public class LocalDateExample {
    static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = LocalDate.now().minusDays(1);
        LocalDate pastDate = LocalDate.now().minusMonths(200);
        String StoreDataInBasicEnglish = String.valueOf((LocalDate.now().getDayOfMonth() + " " + LocalDate.now().getMonth() + " " + LocalDate.now().getYear()));
        String val = "NO";
        if(today.isAfter(yesterday)) val = "YES";
        System.out.println(today);
        System.out.println(yesterday);
        System.out.println(pastDate);
        System.out.println(StoreDataInBasicEnglish);
        System.out.println(val);
    }
}
