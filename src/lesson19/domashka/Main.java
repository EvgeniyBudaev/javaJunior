package lesson19.domashka;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileCopyFailedException {
        FileCopyUtilsImpl fileCopy = new FileCopyUtilsImpl();
        //Первый способ копирования файлов
        try {
            fileCopy.copyFile("D:\\111\\Foto\\фотка.jpg", "D:\\111\\Foto\\фоткаCopy.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Второй способ копирования файлов
        try {
            fileCopy.copyFile2("D:\\111\\Foto\\фотка.jpg", "D:\\111\\Foto");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Третий способ копирования файлов
        //NIO: Copy File using FileChannel
        String srcFileName = "D:\\111\\Foto\\фотка.jpg";
        String dstFileName = "D:\\111\\Foto\\фоткаCopy3.jpg";
        try {
            fileCopy.copyFile3(srcFileName, dstFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Четвертый способ копирования файлов
        try {
            CopyUtils1 utils = new CopyUtils1();
            utils.copyFile("dfsdf", "dfgd");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
