package TestSingleton;

public class Printer {

    private static final Printer PRINTER = new Printer();


    private Printer() {

    }
    public static Printer getInstance() {
        return PRINTER;
    }
    public void print(){
        System.out.println("Printing...");

    }

    @Override
    public String toString() {
        return "Printer";
    }

}
