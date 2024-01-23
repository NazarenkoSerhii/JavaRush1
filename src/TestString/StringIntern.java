package TestString;

public class StringIntern {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println("===================================================");

        String a = str1.intern();
        String b = str2.intern();
        System.out.println(a==b);
        System.out.println("=====================================================");

        System.out.println(eqal(a,b));

    }
    public static boolean eqal(String first, String second){

        return first.intern()==second.intern();
    }
}
