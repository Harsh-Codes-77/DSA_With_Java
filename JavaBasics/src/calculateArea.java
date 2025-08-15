import java.util.Scanner;

public class calculateArea {

    // Method to calculate the area of a rectangle
    public double area(double length, double breadth) {
        return length * breadth;
    }

    // Method to calculate the area of a circle
    public double area(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        calculateArea calculator = new calculateArea();
        Scanner scanner = new Scanner(System.in);

        // Calculate and display the area of a rectangle
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        double rectangleArea = calculator.area(length, width);
        System.out.println("Area of the rectangle: " + String.format("%.2f", rectangleArea));

        // Calculate and display the area of a circle
        System.out.print("Radius: ");
        double radius = scanner.nextDouble();
        double circleArea = calculator.area(radius);
        System.out.println("Area of the circle: " + String.format("%.2f", circleArea));

        scanner.close();
    }
}
