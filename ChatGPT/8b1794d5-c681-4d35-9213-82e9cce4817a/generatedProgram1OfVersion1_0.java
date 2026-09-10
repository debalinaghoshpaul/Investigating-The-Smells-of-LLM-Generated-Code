
public class UpdateArrayElement {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Remove the third element from the ArrayList
        arrayList.remove(2);

        // Print the updated ArrayList
        System.out.println("Updated ArrayList: " + arrayList);
    }
}