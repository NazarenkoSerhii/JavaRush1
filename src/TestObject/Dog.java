package TestObject;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;
    private int weight;

    public Dog(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Dog(){

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age>0) {
            this.age = age;
        }else {
            System.out.println("Wrong!!!");
        }
    }

    public void setWeight(int weight) {
        if(weight>0) {
            this.weight = weight;
        }else {
            System.out.println("Wrong!!!");
        }
    }

    public void run(){
        System.out.println("Gog is running");
    }
    public void sit(){
        System.out.println("Gog is sitting");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && weight == dog.weight && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }
}
