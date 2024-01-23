package TestHashSet_____Iterator;

import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet <String> strings = new HashSet<>();
        strings.add("one");
        strings.add("one");    // выводит в разброс
        strings.add("two");
        strings.add("three");
        strings.add("four");
        strings.add("five");
        strings.add("1");      // выводит по порядку
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        System.out.println(strings.contains("five")); // проверяет есть ли элемент

        System.out.println(strings);
        System.out.println(strings.size());
    }
}
