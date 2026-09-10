import java.util.Arrays;

public class FindTopThreeBuildingHeights {

    public static void main(String[] args) {
        int[] buildingHeights = {100, 200, 300, 400, 500, 600, 700, 800};

        // Sort the array in descending order
        Arrays.sort(buildingHeights);

        // Print the heights of the top three buildings
        System.out.println("The heights of the top three buildings in descending order are:");
        for (int i = buildingHeights.length - 1; i >= buildingHeights.length - 3; i--) {
            System.out.println(buildingHeights[i]);
        }
    }
}
