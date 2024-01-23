package TestIntenceOf;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object[] objects = {10, "777", 3.14};
        for (int i= 0; i< objects.length;i++){
            if (objects[i] instanceof String){
                String str = (String) objects[i];
                System.out.println("String - " + str);
            }if(objects[i] instanceof Integer){
                int a = (Integer) objects[i];
                System.out.println("int - " + a);
            }if (objects[i] instanceof Double){
                double d = (Double) objects[i];
                System.out.println("double - "+ d);
            }
        }
    }
}
