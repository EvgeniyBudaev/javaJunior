package lesson19.domashka;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyUtils1 implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File destinationFile = new File(destination);
        if(destinationFile.exists()){
            throw new FileCopyFailedException("destination already exists");

        }

        Path pathFrom = Paths.get(source);
        Path pathTo = Paths.get(destination);
        try {
            Files.copy(pathFrom, pathTo, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            throw new FileCopyFailedException(e.getMessage());
        }
    }
}
