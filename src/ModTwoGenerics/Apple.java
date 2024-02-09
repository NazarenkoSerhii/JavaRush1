package ModTwoGenerics;

import TestString.StringFormat;

public  class Apple extends Fruit{
    public Apple(String name) {
        super(name);
    }

    @Override
    void info() {
        System.out.println(getName());
    }

    @Override
    public String toString() {
        return String.format( "Apple{ %s }",getName());
    }
}
