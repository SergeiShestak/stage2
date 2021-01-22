import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main (String [] args) throws IOException {


        if (args == null || args.length == 0) {

            System.out.println("Please start with arguments Path to file or Folder");
        }



        for (String refined:args) {

            Path argsPath = Paths.get(refined);
            File argsFile = argsPath.toFile();

            if (argsFile.exists() && !argsFile.isDirectory()) {
                HandlerFolder.listFilesForFolder(argsPath.getParent().getParent().getParent());
                System.out.println("Size of file is: ");

                System.out.println("Amount of folders: " + argsFile.list().length);
                System.out.println("Average amount files in the folders: ");


            }else {
                HandlerFolder.listFilesForFolder(argsPath);
                PathInFile.checkingFile(HandlerFolder.filesMap);
            }

        }
    }

}
