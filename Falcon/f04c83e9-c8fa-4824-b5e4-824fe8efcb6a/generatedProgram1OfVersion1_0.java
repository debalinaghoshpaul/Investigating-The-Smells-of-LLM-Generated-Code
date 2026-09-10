import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

public class Environment {
    public static void main(String[] args) throws Exception {
        Hashtable<String, String> env = new Hashtable<String, String>();
        Properties props = System.getProperties();
        Enumeration<Object> keys = props.keys();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            String value = props.getProperty(key);
            env.put(key, value);
        }
        System.out.println("Environment Variables:");
        for (String key : env.keySet()) {
            System.out.println(key + " = " + env.get(key));
        }
    }
}

