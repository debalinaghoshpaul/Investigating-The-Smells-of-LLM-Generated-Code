abstract class Shape3D {
    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
}

class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

class Cube extends Shape3D {
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(sideLength, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }
}

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        System.out.println("Volume of sphere: " + sphere.calculateVolume());
        System.out.println("Surface Area of sphere: " + sphere.calculateSurfaceArea());

        Cube cube = new Cube(4);
        System.out.println("Volume of cube: " + cube.calculateVolume());
        System.out.println("Surface Area of cube: " + cube.calculateSurfaceArea());
    }
}
