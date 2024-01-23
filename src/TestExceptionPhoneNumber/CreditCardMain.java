package TestExceptionPhoneNumber;

public class CreditCardMain {
    public static void main(String[] args) {
        String number = "+1-111-111-11-11";
        PhoneNumberRegisterService service = new PhoneNumberRegisterService();
        try {
            service.validatePhone("+1-111-111-11-11");
        } catch (PhoneNumberIsExistException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
            StackTraceElement[] elements = e.getStackTrace();
            for (StackTraceElement stackTraceElement:elements){
                System.out.println(stackTraceElement);
            }

        }
    }
}
