package TestHashSet_____Iterator;

import java.util.HashSet;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class testHashSetSolution2 {
    public static HashSet<String> words = new HashSet<>(asList("Hello World I,m A java Developer".split(" ")));

    public static void checkWords(String word){
        if(words.contains(word)){
            System.out.println("Слово "+ word+ " есть");
        }else {
            System.out.println("Слово "+ word+ " нет");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        checkWords(str);


    }
}
