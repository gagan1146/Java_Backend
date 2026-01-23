package org.example.Java8.DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

;

public class ExampleOfDateTimeAPI {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = dateTime.format(formatter);
        LocalDateTime parsed = LocalDateTime.parse("22-01-2026 21:57:00", formatter);

        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate lastMonth = today.minusMonths(1);

        LocalDate startDate = LocalDate.of(2025, 1, 1);
        LocalDate endDate = LocalDate.of(2026, 1, 22);
        Period period = Period.between(startDate, endDate);

        LocalDateTime startTime = LocalDateTime.now();
        LocalDateTime endTime = startTime.plusHours(5).plusMinutes(30);
        Duration duration = Duration.between(startTime, endTime);

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(formatted);
        System.out.println(parsed);
        System.out.println(indiaTime);
        System.out.println(newYorkTime);
        System.out.println(nextWeek);
        System.out.println(lastMonth);
        System.out.println(period);
        System.out.println(duration);
    }
}
