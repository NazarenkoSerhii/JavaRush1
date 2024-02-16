package ModTwoTestGenerics;

import java.util.List;

public class TestClass {
    public <T> void fill(List<T> list, T object) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, object);
        }
    }
}
