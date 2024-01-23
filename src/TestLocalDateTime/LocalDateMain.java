package TestLocalDateTime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Сегодня - " + now);
        System.out.println("======================");
        now = now.minusDays(1);
        now = now.plusDays(1);
        System.out.println(now);
        System.out.println("=================");
        System.out.println(now.minusDays(2));

        LocalDate now1 = LocalDate.of(2024,01,01);
        System.out.println(now1);

        String str = now.format(DateTimeFormatter.ofPattern("dd/MM/yy"));
        System.out.println(str);
        System.out.println(now.minus(1, ChronoUnit.DAYS));
        System.out.println("========================");


        ZoneId timeZone = ZoneId.of("Asia/Shanghai");
        LocalDate today = LocalDate.now(timeZone);
        System.out.println("Сегодня в Шанхае - "+ today);
        today = today.plusDays(1);
        System.out.println("Сегодня в Шанхае '+ 1 день' - "+ today);
    }
}
