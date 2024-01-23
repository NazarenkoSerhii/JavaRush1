package TestDateCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalendarMain {
    public static void main(String[] args) {

        Calendar instance = Calendar.getInstance();
        System.out.println(instance.getTime());
        instance.add(Calendar.DAY_OF_MONTH,1);
        System.out.println(instance.getTime());
        System.out.println(instance.getCalendarType());

        System.out.println("=============================");

        Calendar date1 = new GregorianCalendar();
        int month = date1.get(Calendar.MONTH);
        System.out.println(month);
        int day = date1.get(Calendar.DAY_OF_WEEK);
        System.out.println(day);
        date1.set(Calendar.DAY_OF_WEEK,1);
        System.out.println(date1.getTime());

        if(date1.get(Calendar.MONTH)==Calendar.JANUARY){
            System.out.println("JANUARY");
        }
        System.out.println("==============");

        date1.add(Calendar.MONTH, + 6);
        System.out.println(date1.getTime());
        date1.add(Calendar.MONTH,-1);
        System.out.println(date1.getTime());

        date1.roll(Calendar.MONTH,-8);        // roll - меняет один параметр, не меняя другие
        System.out.println(date1.getTime());
    }
}
