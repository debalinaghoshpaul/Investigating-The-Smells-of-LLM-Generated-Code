public class CalculateTimeTaken {

    public static void main(String[] args) {
        int distance = 55;
        int speed = 15;
        
        double timeInHours = (double) distance / speed;
        int hours = (int) timeInHours;
        int minutes = (int) ((timeInHours - hours) * 60);
        
        System.out.println("Total time taken: " + hours + " hours and " + minutes + " minutes.");
    }

}
