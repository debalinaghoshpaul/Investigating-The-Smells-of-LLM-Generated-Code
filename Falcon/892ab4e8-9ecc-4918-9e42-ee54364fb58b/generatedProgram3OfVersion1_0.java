// Cube.java
// Class Cube that extends Shape3D

public class Cube extends Shape3D {

    private double sideLength;

    // Constructor
    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    // Override methods to calculate volume and surface area
    @Override
    public double calculateVolume() {
        return Math.pow(sideLength, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }
}
