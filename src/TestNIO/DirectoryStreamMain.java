package TestNIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryStreamMain {
    public static void main(String[] args) {

        Path path= Path.of("/");

        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {

            for (Path p:directoryStream){
                System.out.println(p);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
