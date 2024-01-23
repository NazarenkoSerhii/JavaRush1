package TestObject;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Lucky",2,7);
        Dog dog2 = new Dog("Lucky",2,7);
        dog.run();
        dog.sit();
        Dog dog1 = new Dog("Rex",5,10);
        Dog dog3= dog2;

        System.out.println(dog.equals(dog2));
        System.out.println(dog==dog2);
        System.out.println(dog3==dog2);

         dog.setName("XXX");
        System.out.println(dog.getName());


    }

}
