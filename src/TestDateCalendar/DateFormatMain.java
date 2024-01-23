package TestDateCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatMain {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss zzzz");
        System.out.println(simpleDateFormat.format(date));
    }
}
