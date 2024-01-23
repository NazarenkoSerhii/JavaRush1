package TestHashSet_____Iterator;

import java.util.HashSet;

public class testHashSetSolution {
    public static void main(String[] args) {
        String[] words = {"Hello", " World", " I,m", " A java", " Developer"};
        for (String s:words) {
            System.out.print(s + " ");
                    }
        System.out.println();
        System.out.println("==========================");

        HashSet<String> hashSet= arrayToHashSet(words);
        for (String s:hashSet) {
            System.out.print(s+ " ");
        }
    }
    public static HashSet<String> arrayToHashSet(String[] strings) {
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < strings.length; i++) {
            hashSet.add(strings[i]);
        }
        return hashSet;
    }
}
