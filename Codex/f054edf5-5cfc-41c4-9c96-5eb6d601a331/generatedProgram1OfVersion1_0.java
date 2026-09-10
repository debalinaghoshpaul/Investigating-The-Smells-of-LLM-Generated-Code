import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Produce {
    private String name;

    public Produce(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}

class Fruit extends Produce {
    public Fruit(String name) {
        super(name);
    }
}

class Vegetable extends Produce {
    public Vegetable(String name) {
        super(name);
    }
}

class BoxOfProduce {
    private Produce[] produce;

    public BoxOfProduce(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                count++;
            }
            scanner.close();

            produce = new Produce[count];

            scanner = new Scanner(file);
            int index = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                String type = parts[1];

                if (type.equals("Fruit")) {
                    produce[index] = new Fruit(name);
                } else if (type.equals("Vegetable")) {
                    produce[index] = new Vegetable(name);
                }

                index++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printContents() {
        int fruitCount = 0;
        int vegetableCount = 0;

        for (Produce p : produce) {
            System.out.println(p);

            if (p instanceof Fruit) {
                fruitCount++;
            } else if (p instanceof Vegetable) {
                vegetableCount++;
            }
        }

        System.out.println("Number of fruits: " + fruitCount);
        System.out.println("Number of vegetables: " + vegetableCount);
    }
}

public class Main {
    public static void main(String[] args) {
        BoxOfProduce box = new BoxOfProduce("produce.txt");
        box.printContents();
    }
}