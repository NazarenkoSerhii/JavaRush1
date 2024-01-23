package TestDateCalendar;


import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());       //милсек  с 1 января 1970 г. Unix - date

        Date date1 = new Date(124,00,01);     // год начинается с 1900, месяц с 00.
        System.out.println(date1);

        Date date2 = new Date(124,00,01,01,01,01);
        System.out.println(date2);

        System.out.println(date2.getYear());
        System.out.println(date2.getMonth());
        System.out.println(date2.getDate());
        System.out.println(date2.getDay());

    }
}
