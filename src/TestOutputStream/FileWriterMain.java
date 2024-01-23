package TestOutputStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterMain {
    public static void main(String[] args) {
        String path = "textCopy.txt";

        try (Writer writer = new FileWriter(path)) {
            String someText = " Hello World !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
            writer.write(someText);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
