package TestExceptionAndStackTraceAndError;

import TestExceptionAndStackTraceAndError.exceptions.ReceiverIsEmptyException;

public class MailService {
    public void sendMail(String to, String text){
        if(to.isEmpty()){
            throw new ReceiverIsEmptyException("To can't be empty!!!");

        }
    }
}
