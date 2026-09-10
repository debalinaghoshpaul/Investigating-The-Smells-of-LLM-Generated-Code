import java.security.Security;
import java.util.Properties;

public class SystemPropertiesAndEnvironment {

    public static void main(String[] args) {
        // Get the current system environment
        Properties environment = System.getenv();
        for (String key : environment.stringPropertyNames()) {
            System.out.println(key + ": " + environment.getProperty(key));
        }

        // Get the current system properties
        Properties properties = System.getProperties();
        for (String key : properties.stringPropertyNames()) {
            System.out.println(key + ": " + properties.getProperty(key));
        }

        // Check whether a security manager has already been established for the current application
        if (System.getSecurityManager() != null) {
            System.out.println("A security manager has already been established for the current application");
        } else {
            System.out.println("A security manager has not been established for the current application");
        }
    }
}
