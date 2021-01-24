import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.StreamSupport;

public class PathToString {

    public static String [] pathToString(String stringPath){

        Path path = Paths.get(stringPath);

        return StreamSupport.stream(path.spliterator(),false).map(Path::toString).toArray(String[]::new);
    }

    public static int countOfFolders(String[] paths){

        int countOfFolders;
        countOfFolders = paths.length;
        return countOfFolders;
    }

    public static long countOfFiles(Path path) throws IOException {

        return Files.walk(path)
                .parallel()
                .filter(p -> !p.toFile().isDirectory())
                .count();
    }
}
