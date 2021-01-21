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
                String[] pathArgs = PathToString.pathToString(argsFile.getAbsolutePath());
                for (String path : pathArgs) {
                    System.out.print(path + "\n\t |---");

                }
            }else {
                HandlerFolder.listFilesForFolder(argsPath);
                PathInFile.checkingFile();
            }

        }
    }

}
