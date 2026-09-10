public class PartiallyFilledArray {
    private int[] a;
    private int numberOfElements;

    public PartiallyFilledArray(int maxNumberOfElements) {
        a = new int[maxNumberOfElements];
        numberOfElements = 0;
    }

    public void addElement(int element) {
        if (numberOfElements == a.length) {
            int[] newArray = new int[a.length * 2];
            System.arraycopy(a, 0, newArray, 0, a.length);
            a = newArray;
        }
        
        a[numberOfElements] = element;
        numberOfElements++;
    }

    public void display() {
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PartiallyFilledArray array = new PartiallyFilledArray(5);

        for (int i = 1; i <= 10; i++) {
            array.addElement(i);
        }

        System.out.println("Array elements:");
        array.display();
    }
}
