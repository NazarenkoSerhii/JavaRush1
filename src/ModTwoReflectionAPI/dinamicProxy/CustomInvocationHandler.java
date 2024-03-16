package ModTwoReflectionAPI.dinamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {
    // Динамический Proxy для интерфейса - он перехватывает вызовы объекта SomeInterface someInterface

    private  final SomeInterface someInterface;

    public CustomInvocationHandler(SomeInterface someInterface) {
        this.someInterface = someInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before method call");
        Object invoke = method.invoke(someInterface);
        System.out.println("After method call");
        return invoke;
    }
}
