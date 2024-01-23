package Test;

import java.util.Arrays;

public class TestMethod2 {

    public static void main(String[] args) {
        int [] array = new int [] {1,2,3,4,5,6,7,8,9};
        int [] array2 = new int[]{2,1,5,6,8,7,9,4,3};
        int [] array3 = new int[]{3,1,5,6,8,7,9,4,2};
        TestMethod.findArrayNumber(array,5);
        TestMethod.print(array);

        TestMethod.sortArray(array2);
        TestMethod.print(array2);
        Arrays.sort(array3);
        TestMethod.print(array3);
        TestMethod.run();


    }


}
