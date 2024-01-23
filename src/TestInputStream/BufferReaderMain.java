package TestInputStream;

import ua.javarush.task.pro.task12.task1217.Solution;

import java.io.*;
import java.util.Scanner;

public class BufferReaderMain {
    public static void main(String[] args) throws IOException {                    // пример 1
        System.out.println("Type your data : ");

        InputStream in = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String srt = bufferedReader.readLine();
        System.out.println("Your text : " + srt);
        System.out.println("===================================");

        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in)); // Альтернатива пример 1
        String srt1 = bufferedReader2.readLine();
        System.out.println("Your text2 : " + srt1);
        System.out.println("===================================");

        FileReader fileReader = new FileReader("text.txt");                 //пример 2
        BufferedReader bufferedReader1 = new BufferedReader(fileReader);//new BufferedReader(new FileReader("text.txt"))
        while (bufferedReader1.ready()) {
            String line = bufferedReader1.readLine();
            System.out.println(line);
        }

        Scanner scanner = new Scanner(System.in);                                  // пример 3 scanner vs bufferReader
        String srt3 = scanner.nextLine();
        System.out.println(srt3);

    }

}
