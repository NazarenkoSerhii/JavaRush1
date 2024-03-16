package ModTwoFacultative;

import TestInputStream.FileInputStreamMain;

import java.io.*;

public class SerializationMain {                               // сериализация и десириализация
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CatSerialization catSerialization = new CatSerialization();

        FileOutputStream fileOutputStream = new FileOutputStream("catSerialization.dat");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(catSerialization);
        fileOutputStream.close();
        outputStream.close();

        FileInputStream fileInputStream = new FileInputStream("catSerialization.dat");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Object object = inputStream.readObject();
        fileOutputStream.close();
        inputStream.close();
        CatSerialization catSerialization1 =(CatSerialization) object;
    }
}
