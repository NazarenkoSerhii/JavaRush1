package TestExceptionAndStackTraceAndError;

import java.io.FileInputStream;
import java.io.IOException;

public class MainTryWithResources  {
    public static void main(String[] args)  {

//        FileInputStream fileInputStream = null;

//        try {
//            fileInputStream = new FileInputStream("text.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                fileInputStream.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
         try(DesktopReader reader = new DesktopReader();
             FileInputStream fileInputStream = new FileInputStream("text.txt")){
         }catch (IOException e){                                                      // Try with resources
             System.out.println(" IO exception !!! ");;                                            // finally and close() -
         }                                                                            // автоматически autocloseable
         catch (Exception e) {
             throw new RuntimeException(e);
         }


    }
}
