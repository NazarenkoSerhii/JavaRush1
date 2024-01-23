package Sololern;

import java.util.Scanner;

public class Bot {
    public static void bot(){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        if(str.equalsIgnoreCase("order")){
            System.out.println("Order confirmed");
        } else if (str.equalsIgnoreCase("contacts")) {
            System.out.println("info@sololearn.com");

        }else {
            System.out.println("Try again");
        }
    }

    public static void main(String[] args) {
        bot();
    }
}
