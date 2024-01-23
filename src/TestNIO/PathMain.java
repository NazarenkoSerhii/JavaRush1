package TestNIO;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMain {
    public static void main(String[] args) {

        Path path = Path.of("TestFiles/text.txt");                        // NIO
        File file = new File("TestFiles/text.txt");               //      IO
        path = path.toAbsolutePath();                                     //Обсолютный путь
        System.out.println(path.getRoot());
        System.out.println(path.getFileSystem());
        System.out.println(path.getFileName());
        System.out.println(path.toAbsolutePath());
        System.out.println(path.toString());
        System.out.println("===========================");

        Path path1 = Paths.get("TestFiles/text.txt");                      //Paths - устарелый класс
        System.out.println(Paths.get(String.valueOf(path1)));                  // Используем - Path.of
    }
}
