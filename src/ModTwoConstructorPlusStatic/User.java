package ModTwoConstructorPlusStatic;

import java.util.Random;

public class User {                               // doSMTH(); в классе можно вызывать методы до создания объекта
    private  static Random random;                   //  так же добавлять их в конструктор

    {
        doSMTH();
        System.out.println("Block...");
        doSMTHNSTATIC();
    }

    static {                                                    // static block initialization first
        Random random1 = new Random();
        random1.nextInt(7);
        System.out.println("Static block...");                  // Static block - just static method
        before();
        doSMTH();

    }
    public  User(){
        doSMTH();
        doSMTHNSTATIC();
        before();
        Random random = new Random();
        System.out.println("Constructor! " + random.nextInt(777));
    }

    public static void before(){
        System.out.println("Before...");
    }
    public static void doSMTH(){
        System.out.println("Doing...");
    }
    public  void doSMTHNSTATIC(){
        System.out.println("Doing...no static...");
    }
}
