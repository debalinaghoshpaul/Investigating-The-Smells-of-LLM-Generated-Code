import java.util.Map;
import java.util.System;

public class GetEnvironmentVariables {

    public static void main(String[] args) {
        // Get the environment variables
        Map<String, String> env = System.getenv();

        // Get the values of the PATH, TEMP, and USERNAME variables
        String path = env.get("PATH");
        String temp = env.get("TEMP");
        String username = env.get("USERNAME");

        // Print the values of the variables
        System.out.println("PATH: " + path);
        System.out.println("TEMP: " + temp);
        System.out.println("USERNAME: " + username);
    }
}
