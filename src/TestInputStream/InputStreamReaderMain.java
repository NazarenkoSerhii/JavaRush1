package TestInputStream;

import java.io.*;

public class InputStreamReaderMain {
    public static void main(String[] args) throws IOException {

        System.out.println("Type your data: ");                                // пример 1
        InputStream in  = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        int temp;
        while ( (temp=inputStreamReader.read())!=-1){

            System.out.print((char)temp);
        }

        FileInputStream fileInputStream = new FileInputStream("text.txt");            //пример 2
        InputStreamReader inputStreamReader1 = new InputStreamReader(fileInputStream);

        while (inputStreamReader1.ready()){
            int temp1=inputStreamReader1.read();
            System.out.print((char)temp1);
        }

    }
}
