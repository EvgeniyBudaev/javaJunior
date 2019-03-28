package lesson18;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        File dir = new File("D:\\111\\222.jpg");
        System.out.println(dir.isFile()); // файл ли это?
        System.out.println(dir.isDirectory()); // папка ли это?
        System.out.println(dir.exists()); // если существует такая папка
        System.out.println();

        if(!dir.exists()){
            //dir.mkdir(); //если папки не существует, то создаем папку
            try {
                dir.createNewFile(); //если файла нет на компе, то создаем его
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File dir2 = new File("D:\\111");

        File[] dirs = dir2.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.getAbsolutePath().endsWith(".jpg") ||
                        pathname.getAbsolutePath().endsWith(".png") ||
                        pathname.getAbsolutePath().endsWith(".jpeg") || pathname.isDirectory()){
                    return true;
                }
                return false;
            }
        });
        for (File f:dirs){
            System.out.println(f.getAbsolutePath()); //достаем полный путь
        }
    }
}
