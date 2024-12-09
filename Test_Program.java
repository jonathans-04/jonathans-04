import java.util.*;

public class Test_Program {

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner kb = new Scanner(System.in);

        // Input: read the three sides of the triangle
        System.out.print("Enter the first side of the triangle: ");
        double side1 = kb.nextDouble();
        System.out.print("Enter the second side of the triangle: ");
        double side2 = kb.nextDouble();
        System.out.print("Enter the third side of the triangle: ");
        double side3 = kb.nextDouble();

        kb.close(); // Close the scanner

        // Check if the triangle is valid
        if (isValid(side1, side2, side3)) {
            double area = area(side1, side2, side3);
            System.out.printf("The area of the triangle is: %.2f\n", area);
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }
    }

    // Method to check if the sides form a valid triangle
    public static boolean isValid(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    // Method to calculate the area of the triangle using Heron's formula
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2; // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
