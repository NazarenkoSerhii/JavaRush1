package ModTwoTestGenerics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayToCollection array = new ArrayToCollection();

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
        System.out.println(array.arrayToCollection(array1));

        TestClass testClass = new TestClass();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Old");
        arrayList.add("Old1");
        arrayList.add("Old2");
        testClass.fill(arrayList, "New");
        System.out.println(arrayList);

        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        arrayListInteger.add(1);
        arrayListInteger.add(2);
        arrayListInteger.add(3);
        testClass.fill(arrayListInteger, 7);
        System.out.println(arrayListInteger);


        Box<String> boxString = new Box<>();
//        boxString.getT();
        boxString.setT("New box");                         // only String
        System.out.println(boxString.getT());

        Box<Integer> boxInteger = new Box<>();
//        boxInteger.getT();
        boxInteger.setT(7);                              // only Integer
        System.out.println(boxInteger.getT());
    }

}
