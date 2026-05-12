package week10;

public class AppConfig {
    private String databaseName;
    private String appName;
    private static AppConfig soleInstance;

    private AppConfig(String databaseName, String appName) {
        this.databaseName = databaseName;
        this.appName = appName;
    }

    public static AppConfig createInstance(String databaseName, String appName){
        if(soleInstance == null) {
            soleInstance = new AppConfig(databaseName, appName);
        }
        return soleInstance;
    }
}
