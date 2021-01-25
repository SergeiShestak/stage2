import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;

public class PathInFile {

    final static String path = ("treefiles.txt");

    public static void writeFile(Map<Path, Set<File>> filesMap) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            {
                filesMap.forEach((key, value) -> {
                    try {
                        writer.write(String.format("\n%s\n", key));
                        for (File val : value) {
                            writer.write(String.format("\t|--------%s\n", val));
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void checkingFile(Map<Path, Set<File>> filesMap) {
        Path existPath = Paths.get(path);
        if (existPath.toFile().exists()) {

            if (existPath.toFile().length() > 0){
                writeFile(filesMap);
            } else {
                System.out.println("ELSE");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
                    {
                        filesMap.forEach((key, value) -> {
                            try {
                                writer.write(String.format("\n%s\n", key));
                                for (File val : value) {
                                    writer.write(String.format("\t|--------%s\n", val));
                                }

                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });

                    }

                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}




