package TestExceptionPhoneNumber;

public class PhoneNumberIsExistException extends Exception{
    public  PhoneNumberIsExistException(String message){
        super(message);
    }
}
