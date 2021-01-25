import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

public class Main {

    public static void main (String [] args) {


        if (args == null || args.length == 0) {

            System.out.println("Please start with arguments Path to file or Folder");
        }else {
            for (String refined:args) {

                Path argsPath = Paths.get(refined);
                File argsFile = argsPath.toFile();

                if (argsFile.exists() && !argsFile.isDirectory()) {
                    int numberOfFolders = ReadingFile.readingFile(argsPath).size();
                    int numbersOfFiles = ReadingFile.readingFile(argsPath).values().stream().mapToInt(Set::size).sum();
                    int lengthOfNameOfFile = ReadingFile.readingFile(argsPath).values().toString().trim().length();

                    System.out.println("Number of folders: " + numberOfFolders);
                    System.out.println("Number of files: " + numbersOfFiles);
                    System.out.println("Average of files in the folders: " + numbersOfFiles/numberOfFolders);
                    System.out.println("Average length of name of file:  " + lengthOfNameOfFile/numbersOfFiles);

                }else {
                    HandlerFolder.listFilesForFolder(argsPath);
                    PathInFile.checkingFile(HandlerFolder.filesMap);
                }

            }
        }




    }

}
