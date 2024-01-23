package TestLocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        System.out.println("================");

        LocalDateTime dateTime1 = LocalDateTime.of(2024,01,01,01,01,01);
        System.out.println(dateTime1);

        System.out.println("================");

        LocalDateTime dateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(dateTime2);

        System.out.println("================");

        LocalDate date = LocalDate.now();
        LocalTime time=LocalTime.now();
        LocalDateTime dateTime3 = LocalDateTime.of(date,time);
        System.out.println(dateTime3);
    }
}
