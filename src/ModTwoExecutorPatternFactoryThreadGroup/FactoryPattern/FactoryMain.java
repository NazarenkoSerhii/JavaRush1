package ModTwoExecutorPatternFactoryThreadGroup.FactoryPattern;

public class FactoryMain {
    public static void main(String[] args) {
        Product beery = ProductFactory.createProduct("Beer");
        beery.info();
    }
}
