package org.example.Java8.DateTime.LocalTime;

import java.time.LocalTime;

public class LocalTimeExample {
    static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime customTime = LocalTime.of(8,45);
        LocalTime parsedTimeTillMinute = LocalTime.parse("22:10");
        LocalTime parsedTimeTillSecond = LocalTime.parse("22:00:22");
        LocalTime parsedTimeTillNanoSecond = LocalTime.parse("22:00:40.100");
        LocalTime pastHourTime = LocalTime.now().minusHours(1);
        LocalTime pastMinuteTime = LocalTime.now().minusMinutes(1);
        System.out.println(currentTime);
        System.out.println(customTime);
        System.out.println(parsedTimeTillMinute);
        System.out.println(parsedTimeTillSecond);
        System.out.println(parsedTimeTillNanoSecond);
        System.out.println(pastHourTime);
        System.out.println(pastMinuteTime);
    }
}
