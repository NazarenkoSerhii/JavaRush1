package ModTwoExecutorPatternFactoryThreadGroup.FactoryPattern;

public class ProductFactory {                                             // утилитный класс
    public static Product createProduct (String type){
        Product product = null;
        if ("Apple".equals(type)){
            product= new Apple();
        }else if ("Beer".equals(type)){
            product= new Beer();
        }
        return product;
    }
}
