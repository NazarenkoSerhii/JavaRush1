package ModTwoReflectionAPI.dinamicProxy;

import java.lang.reflect.Proxy;

public class DynamicProxyMain {
    public static void main(String[] args) {
        SomeInterface someInterface = new SomeCustomClass();

        SomeInterface instance = (SomeInterface) Proxy.newProxyInstance(SomeInterface.class.getClassLoader()
                , new Class[]{SomeInterface.class}, new CustomInvocationHandler(someInterface));
        instance.doSomeThing();
    }
}
