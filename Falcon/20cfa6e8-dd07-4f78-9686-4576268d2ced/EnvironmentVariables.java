import java.util.Map;
import java.util.Set;

public class EnvironmentVariables {

    public static void main(String[] args) {
        // Check if a security manager has already been established for the current application
        if (System.getSecurityManager() != null) {
            System.out.println("A security manager has already been established for the current application.");
        } else {
            System.out.println("No security manager has been established for the current application.");
        }

        // Get the value of environment variables PATH, TEMP, USERNAME
        Map<String, String> env = System.getenv();
        Set<String> keys = env.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + env.get(key));
        }
    }
}
