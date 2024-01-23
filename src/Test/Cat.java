package Test;

public class Cat {
    String name;
    int age;
    int weight;

    public Cat(String nameC,int ageC, int weightC){   //Конструктор
    this.name=nameC;
    this.age=ageC;
    this.weight=weightC;
     }
     public void sayMeow(){
         System.out.println("Meow");
     }

    public static void main(String[] args) {
        Cat cat = new Cat("Bonya",5,4);   //Объект
        System.out.println("Name " + cat.name+"\n" + "Age "+ cat.age+"\n"+"Weight "+ cat.weight);
        cat.sayMeow();
    }

}
