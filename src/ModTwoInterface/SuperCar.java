package ModTwoInterface;

public class SuperCar extends Car implements Flying,Swimming{
    @Override
    public void fly() {
        System.out.println("Car is fly....");
    }

    @Override
    public void swim() {
        System.out.println("Car is swim...");
    }

    @Override
    public void drive() {
        System.out.println("Supercar is drive...");
    }
}
