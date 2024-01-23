package TestNIO;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelMain {
    public static void main(String[] args) {
        String fileCopy = "TestFiles/FileCopy.txt";
        String file = "TestFiles/File.txt";
                                                                                          // Новая форма записи
        try (FileInputStream fileInputStream = new FileInputStream(file);                 // (InputStream fileInputStream = Files.newInputStream(Path.of(file));
             FileOutputStream fileCopyOutputStream = new FileOutputStream(fileCopy);      // OutputStream fileCopyOutputStream = Files.newOutputStream(Path.of(fileCopy));
             FileChannel fileChannel = fileInputStream.getChannel();
             FileChannel fileCopyChannel = fileCopyOutputStream.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(100);
            while (fileChannel.read(buffer) > 0) {
                buffer.flip();                                           //переключает буфер с чтения на запись
                fileCopyChannel.write(buffer);
                buffer.clear();
                System.out.println("Copy is done");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

