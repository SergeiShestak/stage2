package util;

import java.util.ResourceBundle;

public class ReaderEnvironment {

    private static ResourceBundle resourceBundle = ResourceBundle.getBundle(System.getProperty("environment"));

    public static String getInputData(String key){
        return resourceBundle.getString(key);
    }
}
