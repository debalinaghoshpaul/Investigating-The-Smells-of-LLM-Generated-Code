import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class BoxOfProduce {
    private String item1;
    private String item2;
    private String item3;

    public BoxOfProduce(String item1, String item2, String item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public String getItem1() {
        return item1;
    }

    public String getItem2() {
        return item2;
    }

    public String getItem3() {
        return item3;
    }

    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    public void setItem3(String item3) {
        this.item3 = item3;
    }

    @Override
    public String toString() {
        return "Box Contents: " + item1 + ", " + item2 + ", " + item3;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<String> produceList = new ArrayList<>();
        try {
            File file = new File("produce.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()) {
                produceList.add(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Random random = new Random();
        String item1 = produceList.get(random.nextInt(produceList.size()));
        String item2 = produceList.get(random.nextInt(produceList.size()));
        String item3 = produceList.get(random.nextInt(produceList.size()));

        BoxOfProduce box = new BoxOfProduce(item1, item2, item3);
        System.out.println(box);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a substitution for item 1: ");
        String substitution1 = input.nextLine();
        System.out.println("Enter a substitution for item 2: ");
        String substitution2 = input.nextLine();
        System.out.println("Enter a substitution for item 3: ");
        String substitution3 = input.nextLine();

        box.setItem1(substitution1);
        box.setItem2(substitution2);
        box.setItem3(substitution3);

        System.out.println("Final Box Contents: " + box.getItem1() + ", " + box.getItem2() + ", " + box.getItem3());
    }
}
