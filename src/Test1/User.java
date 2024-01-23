package Test1;

import java.util.Scanner;

public class User {
    public String firstName;


    public String lastName;
    public int age;

    public  void say(){
        Scanner scanner=new Scanner(System.in);
        String word = scanner.nextLine();
        if (word.equalsIgnoreCase("Hello")){
            System.out.println("Hi");
        }else {
            System.out.println("Good buy");
        }


    }

}
