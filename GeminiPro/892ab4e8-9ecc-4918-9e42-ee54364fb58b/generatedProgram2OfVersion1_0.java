// Sphere.java
// Class Sphere that extends Shape3D

public class Sphere extends Shape3D {

    private double radius;

    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Override methods to calculate volume and surface area
    @Override
    public double calculateVolume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
