package TestLocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterMain {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
                /* y	Рік (Year)
                   M	Місяць (Month)
                   d	День (day)
                   H	Години (Hours)
                   m	Хвилини (Minutes)
                   s	Секунди (Seconds)
                   S	Мілісекунди
                   n	Наносекунди */
//          String date = dateTimeFormatter.format(LocalDateTime.now());
//        System.out.println(date);

        LocalDate localDate = LocalDate.parse("2024-01-05",dateTimeFormatter);
        System.out.println(localDate);

        LocalTime localTime = LocalTime.parse("12:06:50",dateTimeFormatter1);
        System.out.println(localTime);

    }
}
