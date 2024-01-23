package Test;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class TestMethod {
    public static void main(String[] args) {
        sayHello();
        String a=say("Java");
        System.out.println(a);
        int [] array = creatArray();
        System.out.println(Arrays.toString(array));
        print(array);

        int [] array2= new int [] {10,2,3,4,5,6,9,8,7,4,1,3,5,8,9,1,0,2};
        findArrayNumber(array2,4);

        printWord("Hello",10);

        final int[] data = {1, 2, 3, 4, 5, 6};// ссылка на объект
        data[0] = 0;
        data[1] = 0;
        data[2] = 0;
        System.out.println(Arrays.toString(data));

    }

    public static void sayHello(){
        System.out.println("Hello");
    }

    public static String say(String str){
        String a=str + " Hello";
        return a;

    }
    public static int[] creatArray(){
        int [] array = new int[10];
        Random random =new Random();
        for (int i=0;i< array.length;i++){
            array[i]= random.nextInt(10);
        }
        return array;
    }

    public static void print(int[] array){
        System.out.println(Arrays.toString(array));
    }
    public static void findArrayNumber(int [] array, int numberToFind){
        int counter = 0;
        for (int i=0;i< array.length;i++){
            if(array[i]==numberToFind){
                System.out.println("Count of steps " + counter);
                return;
            }
            counter++;
        }
    }
    public static void sortArray(int [] array){
        int temp = 0;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length-1;j++)
            if (array[j] > array[j+1]) {
                temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;

            }
//            for (i=0;i<array.length;i++){
//                System.out.print(array[i]+ " ,");
            }

        }
        public static void printWord(String text, int count){
        for (int i =0;i<count;i++) {
            System.out.println(text);
        }
        }
        public  static void run(){
            System.out.println("Run");
        }
    }








