// Main.java
// Main class to test Shape3D, Sphere, and Cube

public class Main {

    public static void main(String[] args) {

        // Create instances of Sphere and Cube
        Sphere sphere = new Sphere(5);
        Cube cube = new Cube(10);

        // Print the volume and surface area of each shape
        System.out.println("Volume of sphere: " + sphere.calculateVolume());
        System.out.println("Surface area of sphere: " + sphere.calculateSurfaceArea());

        System.out.println("Volume of cube: " + cube.calculateVolume());
        System.out.println("Surface area of cube: " + cube.calculateSurfaceArea());
    }
}
