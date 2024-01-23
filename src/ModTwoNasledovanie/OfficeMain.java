package ModTwoNasledovanie;

public class OfficeMain {
    public static void main(String[] args) {
        int age = new Developer("1234567", "John", "Gold", "email", 40, "1234567", "Java").getAge();
        System.out.println(age);
    }
}
