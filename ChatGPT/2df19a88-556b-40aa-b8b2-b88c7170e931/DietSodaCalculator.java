public class DietSodaCalculator {
    public static void main(String[] args) {
        final double SWEETENER_PER_SODA = 0.001;
        
        double sweetenerPerMouse = Double.parseDouble(args[0]);
        double mouseWeight = Double.parseDouble(args[1]);
        double dieterWeight = Double.parseDouble(args[2]);
        
        double lethalDose = sweetenerPerMouse * mouseWeight;
        double maxSodas = (lethalDose / SWEETENER_PER_SODA) / dieterWeight;
        
        System.out.println("The dieter can drink at most " + maxSodas + " diet sodas without dying.");
    }
}
