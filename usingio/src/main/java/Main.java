import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

public class Main {

    public static void main (String [] args) throws IOException {


        if (args == null || args.length == 0) {

            System.out.println("Please start with arguments Path to file or Folder");
        }else {
            for (String refined:args) {

                Path argsPath = Paths.get(refined);
                File argsFile = argsPath.toFile();

                if (argsFile.exists() && !argsFile.isDirectory()) {
                    System.out.println(ReadingFile.ReadingFile(argsPath).toString());
                    System.out.println("Number of folders: " + ReadingFile.ReadingFile(argsPath).size());
                    System.out.println("Number of files: " + ReadingFile.ReadingFile(argsPath).values().stream().mapToInt(Set::size).sum());

                }else {
                    HandlerFolder.listFilesForFolder(argsPath);
                    PathInFile.checkingFile(HandlerFolder.filesMap);
                }

            }
        }




    }

}
