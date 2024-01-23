package ModTwoNasledovanie.PolymorphismMenuPrimer.OOP;

import java.util.HashMap;
import java.util.Scanner;

public class OOPMain {
    public static void main(String[] args) {
        HashMap<Integer, Action> actions = new HashMap<>();
        actions.put(1, new ActionForOne());
        actions.put(2, new ActionForTwo());
        actions.put(3, new ActionForThree());

        try {
            System.out.println("type number for 1 to 3");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            // validation for i
            actions.get(i).execute();
        } catch (Exception e) {
            System.out.println("invalid type");
        }
    }
}
