package TestByteArrayInputStream;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamMain {
    public static void main(String[] args) {
        String str = "Java Rush";
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            byte[] bytes1 = str.getBytes();
            byteArrayOutputStream.write(bytes1);
            for (int i : bytes1) {
                System.out.print(i);
                System.out.print("(" + (char) i + ")" + " ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            FileOutputStream fileOutputStream = new FileOutputStream("textCopy.txt");
            byte[] bytes2 = str.getBytes();
            byteArrayOutputStream2.write(bytes2);
            byteArrayOutputStream2.writeTo(fileOutputStream);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("=======================");

        try (ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream()) {
            byteArrayOutputStream3.write(str.getBytes());
            byte[] bytes3 =byteArrayOutputStream3.toByteArray();
            for (int b:bytes3){
                System.out.print(b);
                System.out.print("(" + (char) b + ")" + " ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
