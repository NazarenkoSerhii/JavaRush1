package TestStatic;

public class Planet {
    public String name;

    public long age;

    public int speed;

    public int area;

    public void printInformationPlanet() {
        System.out.println("Имя планеты: " + name + ".");
        System.out.println("Возраст: " + age + " лет.");
        System.out.println("Орбитальная скорость: " + speed + " км/час.");
        System.out.println("Площадь: " + area + " кв. км.");
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", speed=" + speed +
                ", area=" + area +
                '}';
    }
}
