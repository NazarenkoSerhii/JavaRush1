package TestOutputStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferWriterMain {
    public static void main(String[] args) {
        String path = "textCopy.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            String str1 = "1 line";
            String str2 = "2 line";
            String str3 = "3 line";
            String str4 = "4 line";
            bufferedWriter.write(str1);
            bufferedWriter.newLine();
            bufferedWriter.write(str2);
            bufferedWriter.newLine();
            bufferedWriter.write(str3);
            bufferedWriter.newLine();
            bufferedWriter.write(str4);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}