package TestInputStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class FileReaderMain {
    public static void main(String[] args) {
        String path = "text.txt";


        try (FileReader fileReader = new FileReader(path)) {          // Пример 1
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
        System.out.println();
        System.out.println("===========================");

        try (FileReader fileReader = new FileReader(path)) {          // Пример 2
            int data;
            while (fileReader.ready()) {
                data = fileReader.read();
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
        System.out.println();
        System.out.println("===========================");


    }
}
