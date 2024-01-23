package TestString;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TestStringTokenizer {
    public static void main(String[] args) {
//        String str = "Hello World  I'm a java developer";    // метод split , regex - два пробела
//        String[] strings= str.split("  ");
//        System.out.println(Arrays.toString(strings));


        String str1 = "Hello World  i'm a java developer!";
        StringTokenizer stringTokenizer= new StringTokenizer(str1," ");// StringTokenizer делит по пробелам
        while (stringTokenizer.hasMoreTokens()){
            String string=stringTokenizer.nextToken();
            System.out.println(string);
        }

    }
}
