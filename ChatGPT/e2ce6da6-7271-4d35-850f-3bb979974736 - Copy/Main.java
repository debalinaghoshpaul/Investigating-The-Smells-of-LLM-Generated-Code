import java.util.Scanner;

class Parcel {
    private float weight;
    private String location;

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float calculateCost() {
        float cost = weight * 2;
        if(location.equalsIgnoreCase("within city")) {
            cost += 20;
        } else {
            cost += 40;
        }
        return cost;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Parcel[] parcels = new Parcel[5];

        for(int i = 0; i < 5; i++) {
            parcels[i] = new Parcel();
            System.out.print("Enter the weight of parcel " + (i+1) + " in kg: ");
            float weight = scanner.nextFloat();
            parcels[i].setWeight(weight);
            System.out.print("Enter the location of delivery (within city or outside country): ");
            scanner.nextLine(); // consume newline
            String location = scanner.nextLine();
            parcels[i].setLocation(location);
        }

        System.out.println("\n--- Parcel Costs ---");
        for(int i = 0; i < 5; i++) {
            System.out.println("Parcel " + (i+1) + " Cost: $" + parcels[i].calculateCost());
        }
    }
}
