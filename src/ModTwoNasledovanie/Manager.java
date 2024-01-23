package ModTwoNasledovanie;

public class Manager extends Employee{
    private String manager;

    public Manager(String id, String firstName, String lastName, String email, int age, String phoneNumber, String manager) {
        super(id, firstName, lastName, email, age, phoneNumber); //  new Employee
        this.manager = manager;
    }
}
