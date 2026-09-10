import java.util.UUID;

public class UniqueIdentifier {

    public static void main(String[] args) {
        // Generate a random UUID
        UUID uuid = UUID.randomUUID();

        // Convert the UUID to a string
        String uuidString = uuid.toString();

        // Print the UUID string
        System.out.println("Unique identifier: " + uuidString);
    }
}
