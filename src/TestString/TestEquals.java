package TestString;

public class TestEquals {
    public static void main(String[] args) {
        String a = new String("Car");
        String b = new String("Car");
        System.out.println(a==b);                // false
        System.out.println(a.equals(b));         // true
        System.out.println("=============================");

        String c="Car2";
        String d="Car2";
        System.out.println(c==d);                // true
        System.out.println(c.equals(d));         // true
        System.out.println("==============================");

        String s1 = new String("JavaRush");
        s1 = "JavaRush";
        String s2 = "JavaRush";
//        s2 = new String("JavaRush");
        String s3 = "JavaRush";
//        s3 = new String("JavaRush");
        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));


    }
}
