package ModTwoObjectClass;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Throwable {
        System.out.println(new ExampleClass());
        System.out.println("==================");

        ExampleClass obj1 = new ExampleClass("test", "T09");
        ExampleClass obj2 = new ExampleClass("test", "T09");
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1 == obj2);                                  // false
        ;
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println("==================");

        ExampleClass cloneObj = (ExampleClass) obj1.clone();
        System.out.println(cloneObj.getCode());
        System.out.println(cloneObj.getValue());
        System.out.println(cloneObj.hashCode());
        System.out.println(obj1==cloneObj);                               // false

        obj1.finalize();                                                 // deprecated
        System.out.println("==================");

        Class<? extends ExampleClass> aClass = obj1.getClass();
        System.out.println(aClass.getName());

                                                                           // reflection
        Field value = aClass.getDeclaredField("value");
        value.setAccessible(true);
        value.set(obj1,"Test1111");
        System.out.println(obj1.getValue());


    }
}
