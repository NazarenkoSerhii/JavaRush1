package ModTwoNasledovanie.PolymorphismMenuPrimer;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("type number for 1 to 3");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if (i == 1) {
            System.out.println("some logic for 1 ");
        } else if (i == 2) {
            System.out.println("some logic for 2");

        } else if (i == 3) {
            System.out.println("some logic for 3");
        }else {
            System.out.println("Invalid input");
        }
    }
}
