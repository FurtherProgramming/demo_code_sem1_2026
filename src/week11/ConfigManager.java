package week11;

import java.util.HashMap;

public class ConfigManager {
    private HashMap<String, String> configMap;
    private static ConfigManager instance;

    private ConfigManager() {
        configMap = new HashMap<>();
        configMap.put("admin username", "Admin");
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;

    }

    public HashMap<String, String> getConfigMap() {
        return configMap;
    }
}
