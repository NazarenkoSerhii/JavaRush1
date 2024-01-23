package TestLocalDateTime;

import java.time.*;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        for (String str:ZoneId.getAvailableZoneIds()){              //Список часовых поясов
//            System.out.println(str);
        }
        ZoneId dateTimeZone= ZoneId.of("America/Los_Angeles");
        System.out.println(dateTimeZone);
        LocalDateTime amerDateTime = LocalDateTime.now(dateTimeZone);
        System.out.println(dateTimeZone + " - " + amerDateTime);

        System.out.println("===============");

        ZonedDateTime zonedDateTime = ZonedDateTime.now(dateTimeZone);
        System.out.println(zonedDateTime);

        System.out.println("===============");

        ZonedDateTime zonedDateTimeDefault = ZonedDateTime.now();
        System.out.println(zonedDateTimeDefault);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(dateTimeZone);       //Глобальное время в локальное
        LocalDate localDate =zonedDateTime1.toLocalDate();
        LocalTime localTime = zonedDateTime1.toLocalTime();
        LocalDateTime localDateTime = zonedDateTime1.toLocalDateTime();



    }
}
