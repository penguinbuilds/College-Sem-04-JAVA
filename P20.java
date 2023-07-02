//use interface to calculate the area/volume of a ractangle/cuboid
import java.util.Scanner;

// Define the interface with methods for volume and area calculation
interface Shape {
    double getVolume();
    double getArea();
}

// Implement the Shape interface for cuboid
class Cuboid implements Shape {
    double length, width, height;
    
    // Constructor to initialize the dimensions of the cuboid
    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    // Method to calculate the volume of the cuboid
    public double getVolume() {
        return length * width * height;
    }
    
    // Method to calculate the surface area of the cuboid
    public double getArea() {
        return 2 * (length * width + length * height + width * height);
    }
}

// Implement the Shape interface for rectangle
class Rectangle implements Shape {
    double length, width;
    
    // Constructor to initialize the dimensions of the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Method to calculate the area of the rectangle
    public double getArea() {
        return length * width;
    }
    
    // Since there is no volume for a rectangle, we return 0
    public double getVolume() {
        return 0;
    }
}

// Main class to test the Cuboid and Rectangle classes
public class P20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get dimensions for cuboid
        System.out.print("Enter the length of the cuboid: ");
        double length = input.nextDouble();
        System.out.print("Enter the width of the cuboid: ");
        double width = input.nextDouble();
        System.out.print("Enter the height of the cuboid: ");
        double height = input.nextDouble();
        
        // Create an instance of the Cuboid class
        Cuboid c = new Cuboid(length, width, height);
        
        // Print the volume and area of the cuboid
        System.out.println("Volume of cuboid: " + c.getVolume());
        System.out.println("Surface area of cuboid: " + c.getArea());
        
        // Get dimensions for rectangle
        System.out.print("Enter the length of the rectangle: ");
        length = input.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = input.nextDouble();
        
        // Create an instance of the Rectangle class
        Rectangle r = new Rectangle(length, width);
        
        // Print the area of the rectangle
        System.out.println("Area of rectangle: " + r.getArea());
    }
}
