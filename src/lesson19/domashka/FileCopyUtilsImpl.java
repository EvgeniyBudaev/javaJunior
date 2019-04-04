package lesson19.domashka;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyUtilsImpl implements FileCopyUtils {
    //Первый метод копирования файлов
    @Override
    public void copyFile(String source, String destination) throws IOException, FileCopyFailedException, FileAlreadyExistsException {
        try {
            Path sourcePath = Paths.get(source), destinationPath = Paths.get(destination);
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException exception) {
            System.out.println("Input / output error");
        }
    }

    //Второй метод копирования файлов
    public void copyFile2(String name, String pathname) throws IOException, FileCopyFailedException, FileAlreadyExistsException {
        try (FileInputStream inputStream = new FileInputStream(name)){
            File directory = new File(pathname);
            if(!directory.exists()) directory.mkdir(); //Выполняем проверку: если папка не существует, создадим её с помощью метода mkdir

            try (FileOutputStream outputStream = new FileOutputStream("D:\\111\\Foto\\фоткаCopy2.jpg")){
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

    //Третий метод копирования файлов
    public void copyFile3(String srcFileName, String dstFileName) throws IOException, FileCopyFailedException, FileAlreadyExistsException {
        File srcFile = new File(srcFileName);
        File dstFile = new File(dstFileName);
        if (!dstFile.exists()) {
            dstFile.createNewFile();
        }

        FileInputStream in = null;
        FileOutputStream out = null;
        FileChannel inc = null;
        FileChannel outc = null;

        try {
             in = new FileInputStream(srcFile);
             out = new FileOutputStream(dstFile);
             inc = in.getChannel();
             outc = out.getChannel();
            long count = 0;
            long size = inc.size();
            while (count < size) {
                count += outc.transferFrom(inc, 0, size - count);
            }
        } finally {
            in.close();
            out.close();
            inc.close();
            outc.close();
        }
    }


}