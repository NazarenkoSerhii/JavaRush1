package TestInterFase;

public class Dog extends Animal implements Run{
    private int age;
        public Dog(String name, int weight,int age) {
        super(name, weight);
        this.age=age;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void run() {
        System.out.println(getName()+ " - беги!");

    }


}
