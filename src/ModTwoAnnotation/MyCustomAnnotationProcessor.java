package ModTwoAnnotation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import java.util.Set;

@SupportedAnnotationTypes("IsEmpty")
public class MyCustomAnnotationProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        boolean result = true;
        for (Element element : roundEnv.getElementsAnnotatedWith(IsEmpty.class)) {     // проверка есть ли элементы с
            // с нашей аннотации
            if (element.getKind() == ElementKind.FIELD) {                            // проверка для чего применяется -  поле,метод,класс
                VariableElement variableElement = (VariableElement) element;       // каст class VariableElement
                String fieldName = variableElement.getSimpleName().toString();       //вытягиваем имя переменной для дальнейшего получения значения с помощью reflection

                IsEmpty annotation = element.getAnnotation(IsEmpty.class);
                int min = annotation.min();                                            // вытягиваем поля аннотации
                int max = annotation.max();


                Object fieldValue;

                try {
                    fieldValue = variableElement.getClass()                                   //reflection получаем значение поля
                            .getDeclaredField(fieldName).get(variableElement.getEnclosingElement());

                    if (fieldValue == null || fieldValue.toString().isEmpty()) {           // проверка на null, isEmpty
                        System.out.println("Field is empty");
                    } else {
                        System.out.println("field not empty");
                        result=false;
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return result;
    }
}
