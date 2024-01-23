package TestLocalDateTime;

import java.time.Instant;

public class InstantMain {
    public static void main(String[] args) {
        Instant time = Instant.now();
        System.out.println(time);

        long n= time.toEpochMilli();
        System.out.println(n);

        Instant time1 = Instant.ofEpochMilli(n);
        System.out.println(time1);
    }
}
