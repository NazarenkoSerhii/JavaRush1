package ModTwoReflectionAPI.dinamicProxy;

public class SomeCustomClass implements SomeInterface{
    @Override
    public void doSomeThing() {
        System.out.println("My custom implement");
    }
}
