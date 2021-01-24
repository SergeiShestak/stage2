import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class HandlerFolder {


   static String temp;
   static Map<Path, Set<File>> filesMap = new LinkedHashMap<>();

   public static void listFilesForFolder(final Path folder) {
      Set<File> listTemp = new HashSet<>();
      for(final File fileEntry: folder.toFile().listFiles()){

         if(fileEntry.isDirectory()) {
            listFilesForFolder(fileEntry.toPath());
         }else {
            if(fileEntry.isFile()) {
               temp = (fileEntry.toString());
               listTemp.add(new File(fileEntry.getName()));
               filesMap.put(fileEntry.toPath().getParent().getFileName(),listTemp);

            }

         }

      }
   }


}
