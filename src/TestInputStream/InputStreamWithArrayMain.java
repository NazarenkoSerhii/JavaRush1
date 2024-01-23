package TestInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamWithArrayMain {
    public static void main(String[] args) {

        try (InputStream inputStream = new FileInputStream("text.txt")) {
            for (byte b : inputStream.readAllBytes()) {
                System.out.print((char)b);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
