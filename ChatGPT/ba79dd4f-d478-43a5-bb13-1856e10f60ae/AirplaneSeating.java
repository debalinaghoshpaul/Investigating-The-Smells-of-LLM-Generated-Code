import java.util.Scanner;

public class AirplaneSeating {

    private static char[][] seats = new char[7][4];

    public static void main(String[] args) {
        initializeSeats();
        displaySeatPattern();
        
        Scanner input = new Scanner(System.in);
        String seat;
        
        while (true) {
            System.out.print("Enter the seat you want (enter 'exit' to end): ");
            seat = input.next();
            
            if (seat.equalsIgnoreCase("exit")) {
                break;
            }
            
            if (!assignSeat(seat)) {
                System.out.println("Seat is already occupied. Please choose another seat.");
            }
            
            displaySeatPattern();
        }

        input.close();
    }

    public static void initializeSeats() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                seats[i][j] = (char)('A' + j);
            }
        }
    }

    public static void displaySeatPattern() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean assignSeat(String seat) {
        char rowChar = seat.charAt(0);
        int row = Character.getNumericValue(rowChar) - 1;
        char seatChar = seat.charAt(1);
        
        for (int i = 0; i < 4; i++) {
            if (seats[row][i] == seatChar) {
                seats[row][i] = 'X';
                return true;
            }
        }
        
        return false;
    }
}
