package ModTwoPrevType;

public class InstanceOfMain {
    public static void main(String[] args) {
        Object o = Integer.valueOf(7);
        boolean b = o instanceof String;
        System.out.println(b);
        b = o instanceof Integer;
        System.out.println(b);
        InstanceOfWithGeneric<String > instanceOfWithGeneric = new InstanceOfWithGeneric<>();
        instanceOfWithGeneric.doSomeThing(" Some String");
    }

    private static void doSomeThing(Object obj) {
        if (obj instanceof String) {
            System.out.println("String");
        } else if (obj instanceof Integer) {
            System.out.println("Integer");
        }else System.out.println("Else");
    }
}
