public class MissingLetter {

    public static char findMissingLetter(char[] array) {
        char missing = ' ';
        int diff = array[1] - array[0]; // Calculate the difference between adjacent elements

        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] != diff) {
                missing = (char) (array[i - 1] + diff);
                break;
            }
        }

        return missing;
    }

    public static void main(String[] args) {
        char[] array1 = {'p', 'r', 's', 't'};
        System.out.println("Original array of elements: " + new String(array1));
        System.out.println("Missing letter in the said array: " + findMissingLetter(array1));

        char[] array2 = {'A', 'C', 'D', 'E'};
        System.out.println("Original array of elements: " + new String(array2));
        System.out.println("Missing letter in the said array: " + findMissingLetter(array2));
    }
}
