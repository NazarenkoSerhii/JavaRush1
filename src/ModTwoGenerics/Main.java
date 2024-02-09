package ModTwoGenerics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//
//        List listOfString = new ArrayList();  // List<Object>
//        listOfString.add("str");
//        listOfString.add(1L);
//        listOfString.add(1);
//
//        List<String> list = new ArrayList();   // Generics - обобщение, сужение типов
//        list.add("str");
//     //  list.add(1L);
//     //   list(1);

        Bucket<Apple> appleBucket = new Bucket(); //создаем ведро для ядблок
        for (int i=0;i<10;i++){
            appleBucket.put(new Apple("Apple_" + i));         // добавляем 10 яблок
        }
        appleBucket.showBucket();


        ArrayList<? super Number> numbers =new ArrayList<>(); // ? - wildcards,? super Number - любой тип униследованный от Number
// ? extend Number - только этот тип и тип от которого он наследуется(Number interface)
        numbers.add(7.0);
        numbers.add(7L);
        numbers.add(7);
    }
}