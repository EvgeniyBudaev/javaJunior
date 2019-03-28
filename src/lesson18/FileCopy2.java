package lesson18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy2 {
    public static void main(String[] args) {
        try{
            Path sourcePath = Paths.get("D:\\111\\Foto\\фотка.jpg"), destinationPath = Paths.get("D:\\111\\Foto\\фоткаCopy.jpg");
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);

        }catch (IOException exception){
            System.out.println("Input / output error");

        }
    }
}
