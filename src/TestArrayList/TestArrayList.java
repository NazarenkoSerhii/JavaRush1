package TestArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

//        {{
//            add("1");               // Альтернативный вариант
//            add("2");
//            add("3");
//            add("4");
//            add("5");
//        }};

        System.out.println(arrayList.size());
        String[] array = new String[arrayList.size()];
        arrayList.toArray(array);
        for (String a : array) {
            System.out.println(a);
        }
        System.out.println(arrayList.contains("5"));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.get(4));
        System.out.println("=========================");

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tenWords = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String word = scanner.nextLine();
            tenWords.add(word);
        }
        for (int i = tenWords.size() - 1; i >= 0; i--) {
            System.out.print(tenWords.get(i) + " ");

        }


    }
}
