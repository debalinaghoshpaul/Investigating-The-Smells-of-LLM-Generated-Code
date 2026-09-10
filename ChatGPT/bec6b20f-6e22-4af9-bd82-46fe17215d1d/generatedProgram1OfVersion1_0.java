public class CalculateTimeTaken {
    public static void main(String[] args) {
        int distance = 55;
        int speed = 15;

        double time = (double) distance / speed;
        int hours = (int) time;
        int minutes = (int) ((time - hours) * 60);

        System.out.println("Total time taken: " + hours + " hours and " + minutes + " minutes");
    }
}
