package lesson18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy3 {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("D:\\111\\Foto\\фотка.jpg")){
            File directory = new File("D:\\111\\Foto");
            if(!directory.exists()) directory.mkdir(); //Выполняем проверку: если папка не существует, создадим её с помощью метода mkdir

            try (FileOutputStream outputStream = new FileOutputStream("D:\\111\\Foto\\фоткаCopy.jpg")){
                byte[] bytes = new byte[inputStream.available()];
                int lenght;

                while ((lenght = inputStream.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, lenght);

                }
            }catch (IOException exception) {
                System.out.println("Output error");
            }
        }catch (IOException exception){
            System.out.println("Input error");
        }
    }
}
