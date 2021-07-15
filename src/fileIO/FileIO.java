package fileIO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {

    public static void main(String[] args) {

//        System.out.println(getFilePath("src","fileIO", "test.txt").toAbsolutePath());

//        System.out.println("Does the path exist?");
//        System.out.println(
//                doesPathExist(
//                        getFilePath("src", "fileIO", "test.txt")));

//        tryCreateDirectory(getFilePath("src", "fileIO", "files"));

        init();

    }

    public static void init(){

        // Try to create the directory
        Path path = FileDirectoryUtil.getPath("src", "fileIO", "files");
        FileDirectoryUtil.tryCreateDirectory(path);

        // Try to create the file
        path = Paths.get(path.toAbsolutePath().toString(), "test.txt");
        FileDirectoryUtil.tryCreateFile(path);

        // Print out the final location of the file
        System.out.println(path.toAbsolutePath());

        try {
            IOUtil.printFileContents(IOUtil.readFromFile(path));
        } catch (IOException e){
            System.out.println("Unable to read contents of the file at: " + path.toAbsolutePath());
        }

    }




}