package level2.exercise1.logic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private static Properties properties;

    static {
        try {
            properties = new Properties();
            properties.load(new FileInputStream("src/main/resources/config.properties"));
        }catch (IOException e){
            System.out.println("Error loading settings: "+e.getMessage());
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
