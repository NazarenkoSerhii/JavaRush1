package TestSwitch;

import TestEnum.Day;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scr = scanner.nextInt();
        getMonthByIndex(scr);

    }

    public static String getMonthByIndex(int index) {
        String month;
        switch (index) {
            case 1:
                month ="Сiчень";
                System.out.println(month);
                break;
            case 2:
                month = "Лютий";
                System.out.println(month);
                break;
            case 3:
                month = "Березень";
                System.out.println(month);
                break;
            case 4:
                month = "Квітень";
                System.out.println(month);
                break;
            case 5:
                month = "Травень";
                System.out.println(month);
                break;
            case 6:
                month = "Червень";
                System.out.println(month);
                break;
            case 7:
                month = "Липень";
                System.out.println(month);
                break;
            case 8:
                month = "Серпень";
                System.out.println(month);
                break;
            case 9:
                month = "Вересень";
                System.out.println(month);
                break;
            case 10:
                month = "Жовтень";
                System.out.println(month);
                break;
            case 11:
                month = "Листопад";
                System.out.println(month);
                break;
            case 12:
                month = "Грудень";
                System.out.println(month);
                break;
            default:
                month = "Неприпустимий місяць";
                System.out.println(month);
        }
        return month;
    }
}
