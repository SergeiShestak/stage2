import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReadingFile {

    public static Map<String,Set<String>> readingFile(Path path){

        String resourceLine;

        Map<String, Set<String>> foldersFileMap = new LinkedHashMap<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(path.toString()))){
            resourceLine = reader.readLine();

            while (resourceLine != null){
                Set<String> resourceArray = new HashSet<>();
                String keyLine = null;
                if(resourceLine.equals("")){
                    resourceLine=reader.readLine();
                }
                if(!resourceLine.trim().startsWith("|")) {
                    keyLine = resourceLine;
                    resourceLine = reader.readLine();
                }if (resourceLine.trim().startsWith("|")){
                        while (resourceLine != null && resourceLine.trim().startsWith("|")) {
                            resourceArray.add(resourceLine.substring(0, resourceLine.lastIndexOf(".")).replaceAll("[^a-zA-Z1-9]",""));
                            resourceLine = reader.readLine();
                        }
                }
                foldersFileMap.put(keyLine,resourceArray);

            }
        }catch (NullPointerException | FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return foldersFileMap;
    }
}
