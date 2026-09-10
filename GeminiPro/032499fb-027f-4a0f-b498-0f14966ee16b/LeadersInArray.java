import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LeadersInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read the size of the array
        int n = sc.nextInt();

        // read the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // find the leaders in the array
        List<Integer> leaders = findLeaders(arr);

        // print the leaders
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }

        System.out.println();
    }

    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();

        // start from the last element of the array
        int max = arr[arr.length - 1];

        // add the last element to the list of leaders
        leaders.add(max);

        // iterate over the array from right to left
        for (int i = arr.length - 2; i >= 0; i--) {
            // if the current element is greater than the maximum value found so far, then it is a leader
            if (arr[i] > max) {
                max = arr[i];
                leaders.add(max);
            }
        }

        // reverse the list of leaders so that they are in the correct order
        Collections.reverse(leaders);

        // return the list of leaders
        return leaders;
    }
}
