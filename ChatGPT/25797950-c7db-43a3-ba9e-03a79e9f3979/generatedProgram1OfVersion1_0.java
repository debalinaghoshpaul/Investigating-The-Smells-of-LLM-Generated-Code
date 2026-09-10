import java.util.InputMismatchException;
import java.util.Scanner;

class Airplane {
    private int flightNumber;
    private String destination;
    private String departureTime;

    public Airplane(int flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public boolean checkFlightStatus() {
        // Assume that the flight status is always on time.
        return true;
    }

    public boolean checkDelay(String expectedDepartureTime) {
        // Assume that the expected departure time is always later than the actual departure time.
        return false;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter flight number: ");
            int flightNumber = input.nextInt();

            System.out.print("Enter destination: ");
            String destination = input.next();

            System.out.print("Enter departure time (hh:mm): ");
            String departureTime = input.next();

            Airplane airplane = new Airplane(flightNumber, destination, departureTime);

            if (airplane.checkFlightStatus()) {
                System.out.println("Flight is on time.");
            } else {
                System.out.println("Flight is delayed.");
            }

            System.out.print("Enter expected departure time (hh:mm): ");
            String expectedDepartureTime = input.next();

            if (airplane.checkDelay(expectedDepartureTime)) {
                System.out.println("Flight is delayed.");
            } else {
                System.out.println("Flight is on time.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } finally {
            input.close();
        }
    }
}
