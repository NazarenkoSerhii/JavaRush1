package Test;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {

        perlaceChar();
        
    }

    public static void perlaceChar(){
        System.out.println("Введите - C:/Games");           //замена символа в рядке

        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        String result = str.replace('/','\\');
        System.out.println("Для Unix - C:/Games"  );
        System.out.println("Для Windows - "+result);
    }
}
