package ModTwoPrevType.Company;

public class CompanyMain {
    public static void main(String[] args) {
        Employee employee = new MiddleJavaDeveloper();
        employee.whoAmI();

        if (employee instanceof MiddleJavaDeveloper){
            ((MiddleJavaDeveloper) employee).doCode();
        }

    }
}
