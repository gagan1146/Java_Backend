package org.example.Java8.DateTime.ZonedDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeExample {
    static void main(String[] args) {
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
        System.out.println(currentZonedDateTime);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds.toArray().length);
        System.out.println(availableZoneIds);
        ZonedDateTime IndiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current time in India is : " + IndiaTime );
        System.out.println("Current time in New York is : " + newYorkTime );
    }
}
