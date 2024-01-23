package Test;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число от 0 до 10");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                if (x > 10 || x < 0) {
                    System.out.print("Ошибка ввода!!! ");
                    continue;
                } else
                    System.out.println("Спасибо! Вы ввели " + x);
                break;
            } else
                System.out.print("Ошибка ввода!!! ");
            scanner.nextLine();
        }

    }
}
