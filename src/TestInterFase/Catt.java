package TestInterFase;

public class Catt extends Animal implements Run {
    private int age;

    public Catt(String name, int weight,int age) {
        super(name, weight);
        this.age=age;
    }

    @Override
    public void run() {
        System.out.println("Котик "+getName()+ " беги!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void SayM(){
        System.out.println(getName() + "- Мяу! ");
    }



}
