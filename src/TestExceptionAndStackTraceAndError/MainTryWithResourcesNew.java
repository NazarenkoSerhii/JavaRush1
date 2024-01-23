package TestExceptionAndStackTraceAndError;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTryWithResourcesNew {
    public static void main(String[] args) {


        String path = "c:\\projects\\log.txt";
        FileOutputStream outputStream = null;

//            try {
//                outputStream = new FileOutputStream(path);
//                outputStream.write(1);
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                try {if(outputStream!=null)
//                    outputStream.close();
//                } catch (IOException e) {
//                   throw new RuntimeException();
//                }
//            }

        try (ReaderTryWithResourcesNew readerNew = new ReaderTryWithResourcesNew();
        FileOutputStream outputStream1 = new FileOutputStream(path)){
        } catch (Exception e) {
            System.out.println("IO Exception!!!");;
        }
    }

    }
