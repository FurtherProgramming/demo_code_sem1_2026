package week10;

public class Main {
    public static void main(String[] args) {
        AppConfig myConfiguration = AppConfig.createInstance("dbname", "appname");
        AppConfig myConfig2 = AppConfig.createInstance("dbname2", "appname2");
    }
}
