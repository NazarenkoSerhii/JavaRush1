package TestNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMain {
    public static void main(String[] args) throws IOException {
//        Path path = Path.of("TestFiles/Sub_test");
//        Files.createDirectories(path);
//
//        Path path1 = Path.of("TestFiles/Sub_test/sub_test.txt");
//        Files.createFile(path1);
        Files.writeString(Path.of("TestFiles/Sub_test/sub_test.txt"), "Hello world");
        String data = Files.readString(Path.of("TestFiles/Sub_test/sub_test.txt"));
        System.out.println(data);
    }
}
