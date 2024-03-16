package ModTwoReflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<MyCustomClass> constructor = MyCustomClass.class.getConstructor(String.class); //Указываем параметры конструктора
        MyCustomClass myCustomClass = constructor.newInstance("NewData");                 //Создаем новый конструктор
        System.out.println( myCustomClass.getValue());
    }
}
