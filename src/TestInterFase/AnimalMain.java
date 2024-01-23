package TestInterFase;

import Test.Cat;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex",7,5);
        dog.run();
        dog.sleep();
        System.out.println(dog.toString());

        System.out.println("=======================");
        
        Lion lion=new Lion("King",50,"Kings");
        lion.run();
        lion.sleep();

        System.out.println("=======================");

        Catt cat = new Catt("Bonya",5,7);
        cat.run();
        cat.sleep();
        cat.SayM();



    }

}
