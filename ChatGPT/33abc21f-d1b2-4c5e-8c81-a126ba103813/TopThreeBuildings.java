
public class TopThreeBuildings {

    public static void main(String[] args) {
        int[] buildings = {10, 15, 20, 30, 25, 35, 40, 45};

        Arrays.sort(buildings);

        System.out.println("Top Three Buildings in Descending Order:");

        for (int i = buildings.length - 1; i >= buildings.length - 3; i--) {
            System.out.println(buildings[i]);
        }
    }
}
The given input array represents the heights of eight buildings. The program first sorts the array in ascending order. Then, it prints the top three buildings in descending order by iterating from the end of the array.
