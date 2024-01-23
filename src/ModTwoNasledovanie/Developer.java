package ModTwoNasledovanie;

public class Developer extends Employee { // extends - is  Employee(est')
    private String programingLanguage;

    public Developer(String id, String firstName, String lastName, String email, int age, String phoneNumber, String programingLanguage) {
        super(id, firstName, lastName, email, age, phoneNumber);   //   new Employee
        this.programingLanguage = programingLanguage;
    }
}
