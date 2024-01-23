package TestArrayList;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        char [] chars = str.toCharArray();
        String result = "";
        for (char c :chars) {
            if(!Character.isDigit(c)){
                System.out.println(c + " - is not a digit");
            }else {
                result+=c;
            }
        }
        Integer integer = Integer.valueOf(result);
        System.out.println(result);
    }
}
