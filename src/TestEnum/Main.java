package TestEnum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Day monday = Day.MONDAY;

        Gender male = Gender.MALE;
        Gender male2 = Gender.MALE;
        Gender female = Gender.FEMALE;

        male.setStr("Male");
        female.setStr("Female");

        System.out.println(male);
        System.out.println(male == male2);


        User user = new User("John", 30, Gender.MALE);
        System.out.println(user.toString());


        for (Gender value : Gender.values()) {
            System.out.println(value);
        }
        System.out.println("=========================");
        System.out.println(Day.SUNDAY.ordinal());
        System.out.println(Day.MONDAY.ordinal());

        int day = Day.FRYDAY.ordinal();
        System.out.println(day);

        System.out.println(Seasons.WINTER);

        Day [] days = Day.values();
        for(Day dayss: days){
            System.out.print(dayss+ "-" + dayss.ordinal() + "  ");
        }
        System.out.println();
        System.out.println("==========================");
        List<Seasons> list  = Seasons.asList();

        System.out.println(list);
        System.out.println(Day.values()[1]);


        }

    }

