package TestInputStream;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamMain {
    public static void main(String[] args) {
        String path = "text.txt";
        String pathCopy = "textCopy.txt";

        try (FileInputStream fileInputStream = new FileInputStream(path)) {   // Пример 1
            int data;
            while (fileInputStream.available() > 0) {
                data = fileInputStream.read();
                System.out.print((char) data);

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        try (FileInputStream fileInputStream = new FileInputStream(path)) {  // Пример 2
            int data;
            while ((data = fileInputStream.read())!=-1) {
                System.out.print((char) data);

            }
        }catch (IOException e){
            System.out.println(e.getMessage());
    }
        System.out.println();


        byte[] data = {100,101,102,103,104,105};                                          // Пример 3
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data)) {
            int data1;
            while (byteArrayInputStream.available()>0){          //((data1=byteArrayInputStream.read())!=-1)
                data1=byteArrayInputStream.read();
                System.out.print((char)data1 );
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
