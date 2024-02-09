package ModTwoGenerics;

public class Cherry extends Fruit {

    public Cherry(String name) {
        super(name);
    }

    @Override
    void info() {
        System.out.println("Cherry");
    }

    @Override
    public String toString() {
        return String.format("Cherry{ %s }", getName());
    }
}
