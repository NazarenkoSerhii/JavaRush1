package ModTwoPrevType;

public class InstanceOfWithGeneric<T> {

    public void doSomeThing(T type){
        if (type instanceof String s){
            s.toUpperCase();                              // String s = o(String)
            System.out.println("String" + type);
        }if (type instanceof Integer){
            System.out.println("Integer" + type);
        }
    }
}
