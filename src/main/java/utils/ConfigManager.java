package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Onkar Anand
 * Date 26-12-2012
 * Singleton class to read the properties file.
 */
public class ConfigManager {
    private static ConfigManager manager;
    private static final Properties prop = new Properties();

    private ConfigManager() throws IOException {
        FileReader reader = new FileReader(System.getProperty("user.dir") + File.separator + "resources" +
                File.separator + "config.properties");
        prop.load(reader);
    }

    public static ConfigManager getInstance() {
        if (manager == null) {
            synchronized (ConfigManager.class) {
                try {
                    manager = new ConfigManager();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return manager;
    }

    public String getString(String key) {
        return System.getProperty(key, prop.getProperty(key));
    }
}
