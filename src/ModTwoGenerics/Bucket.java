package ModTwoGenerics;

import java.util.ArrayList;
import java.util.List;

public class Bucket <T extends Fruit>{//T- type,V- value,K - key // T extends Fruit-только тип Fruit или его наследники

    private List<T > content = new ArrayList<>();

    public void put (T t){
        content.add(t);
    }

    public void showBucket(){
        for (T t:content){
            t.info();
        }
    }
}
