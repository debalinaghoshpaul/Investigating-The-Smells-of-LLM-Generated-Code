
public class Converter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fahrenheit to Celsius conversion
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

        // Inches to Meters conversion
        System.out.print("Input a value for inch: ");
        double inch = sc.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is equal to " + meters + " meters");

        sc.close();
    }
}