package ModTwoIncapsulation;

public class User {
    private int age;

    public void setAge(int age) {
        if (age < 0) {
            throw new RuntimeException();
        } else {
            this.age = age;
        }
    }
}
