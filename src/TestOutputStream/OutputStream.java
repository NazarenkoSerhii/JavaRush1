package TestOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) {

        String path = "textCopy.txt";                                             //пример 1
        try (FileOutputStream fileOutputStream = new FileOutputStream(path)) {
            String text = "Hello World !\r\n";
            byte[] textBytes = text.getBytes();
            fileOutputStream.write(textBytes);                       // fileOutputStream.write(text.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileOutputStream fileOutputStream1 = new FileOutputStream(path, true)) {           //пример 2
            String text = "Hello World !!!!!!!!!";                                      // append:true записует текст
            for (byte b : text.getBytes()) {                                            // в конец файла
                fileOutputStream1.write(b);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
