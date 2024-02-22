package ModTwoConstructorPlusStatic;

public class UserMain {
    int a;                     //принадлежит new UserMain
    static int b;              // принадлежит  UserMain class
    public static void main(String[] args) {  // принадлежит  UserMain class
        User user= new User();

        new UserMain().doSMTH();
    }
    private void doSMTH(){   //принадлежит new UserMain

    }
}
