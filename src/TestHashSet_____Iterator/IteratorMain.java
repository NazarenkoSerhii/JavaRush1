package TestHashSet_____Iterator;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("one");
        stringHashSet.add("two");
        stringHashSet.add("three");
        stringHashSet.add("four");
        stringHashSet.add("five");

        Iterator<String> iterator = stringHashSet.iterator();
        int counter = 0;

        while (iterator.hasNext()) {
            System.out.println(counter ++ +": " + iterator.next());
        }
    }
}
