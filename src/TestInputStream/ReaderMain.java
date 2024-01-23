package TestInputStream;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class ReaderMain {
    public static void main(String[] args) {
        String stringArray = "Hello World!!!!!!!";
        try (Reader reader = new StringReader(stringArray)) {
            int tmp;
            while ((tmp= reader.read())!=-1){
                System.out.print((char)tmp );
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
