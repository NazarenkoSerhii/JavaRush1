package ModTwoInterface;

public interface Flying {

    int a = 10; // final

     void fly(); // public

    default void test(){
        System.out.println("default");
    }

}
