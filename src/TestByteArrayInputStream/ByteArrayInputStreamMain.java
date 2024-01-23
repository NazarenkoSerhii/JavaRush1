package TestByteArrayInputStream;

import TestInterFase.Catt;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamMain {
    public static void main(String[] args) {

        byte[] array = {100, 101, 102, 103, 104, 105};

        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array)) {
            for (int b : array) {
                int data = byteArrayInputStream.read();
                System.out.print(data + "  ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("===================");

        byte[] array2 = {1, 2, 3, 4, 5};
        try (ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(array2)) {
            System.out.println("доступных байт для чтения " + byteArrayInputStream2.available());
            int data2 = byteArrayInputStream2.read();
            System.out.println(data2 + " ");
            System.out.println("остаток " + byteArrayInputStream2.available());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("===================");

        byte[] array3 = {1, 2, 3, 4, 5, 6, 7};
        try (ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(array3)) {
            byteArrayInputStream3.skip(3);
            while (byteArrayInputStream3.available() != 0) {
                int data3 = byteArrayInputStream3.read();
                System.out.print(data3 + " ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("===================");


        byte[] array4 = {97, 98, 99, 100,101,102};
        try (ByteArrayInputStream byteArrayInputStream4 = new ByteArrayInputStream(array4)) {
            char[] result = new char[array4.length];
          for (int i = 0;i<result.length;i++){
              result[i]=(char) byteArrayInputStream4.read();
              System.out.print(result[i] + " " );
          }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
