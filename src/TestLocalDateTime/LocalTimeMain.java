package TestLocalDateTime;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime time= LocalTime.now();
        System.out.println(time);

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());

        LocalTime time1 = LocalTime.of(22,20,20);
        System.out.println(time1);

        System.out.println("================");
        time=time.minusHours(1);
        time=time.plusHours(1);
        System.out.println(time);

    }
}
