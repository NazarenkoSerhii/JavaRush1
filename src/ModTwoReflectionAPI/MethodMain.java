package ModTwoReflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        MyCustomClass myCustomClass = new MyCustomClass();
                                                           //getClass() - // Получаем объект типа Class/ class.class
        Method showInfoMethod = myCustomClass.getClass().getMethod("showInfo");  // Получаем нужный метод
        showInfoMethod.invoke(myCustomClass);                                      //Вызываем метод Public


        Method showPrivetInfoMethod = myCustomClass.getClass().getDeclaredMethod("showPrivetInfo");
        showPrivetInfoMethod.setAccessible(true);                           //   открываем доступ Privet
        showPrivetInfoMethod.invoke(myCustomClass);                        // в скобках указываем с какого объекта
                                                                          //  Вызываем метод Privet
      for (Method declaredMethod: myCustomClass.getClass().getDeclaredMethods()){
          System.out.println(declaredMethod);
      }

        MyCustomClass myCustomClass1 = MyCustomClass.class.newInstance();      //создаем новый объект  класса
        myCustomClass1.showInfo();
    }
}
