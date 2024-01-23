package TestSingleton;

public class Main {
    public static void main(String[] args) {

        System.out.println(Printer.getInstance());
        Printer.getInstance().print();

    }
}
