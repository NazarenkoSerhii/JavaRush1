package TestExceptionAndStackTraceAndError;

import TestExceptionAndStackTraceAndError.exceptions.BadSqlException;
import TestExceptionAndStackTraceAndError.exceptions.ReceiverIsEmptyException;

public class Main {
    public static void main(String[] args) {
//        int x = 0;
//     try{
//         int y = 5 /x;
//
//     }catch (Exception e){
//         System.out.println("Exception");
//         throw e;
//     }
//        MailService mailService = new MailService(); // длинная форма записи
//        mailService.sendMail("", "");
//        new MailService().sendMail("", "");   //короткая форма записи

        try {
            new Dbservice().execute("");
            new MailService().sendMail("","");

            } catch (BadSqlException | ReceiverIsEmptyException | NullPointerException e) {
//                throw new RuntimeException(e);
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement stackTraceElement:e.getStackTrace()){        //StackTrace
                System.out.println(stackTraceElement);                           //StackTrace
            }


        }
        }
    }



