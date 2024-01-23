package TestExceptionAndStackTraceAndError;

import java.util.ArrayList;

public class Main4Error {
    public static int counter =0;

    public static void main(String[] args) {

        ArrayList<MemoryUser> list = new ArrayList<>();
        while (true){
            list.add(new MemoryUser());
        }

//        r();

    }
    public static void r(){
        System.out.println(++counter);
        r();
    }

}
