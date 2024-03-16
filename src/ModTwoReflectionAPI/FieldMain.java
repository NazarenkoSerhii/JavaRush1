package ModTwoReflectionAPI;

import java.lang.reflect.Field;

public class FieldMain {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MyCustomClass myCustomClass = new MyCustomClass();
                                                   //getClass() - // Получаем объект типа Class/ class.class
        Field value = myCustomClass.getClass().getDeclaredField("value"); // Получаем значения нужного поля
        value.setAccessible(true);                                              // поле становится доступным
        String str = (String)value.get(myCustomClass);              // Вытягиваем значения поля
        System.out.println("Before change: " + str);
        value.set(myCustomClass,"Changed");                                 // Меняем значения поля
        System.out.println("After changed: "+ myCustomClass.getValue());
    }
}
