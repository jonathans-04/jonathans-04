import java.util.*;
public class Problem_4 
{

	public static void main(String[] args) 
	{
		// scanner
		Scanner kb = new Scanner(System.in);
		
		// declaration
		double side1, side2, side3;
		
		// input
		System.out.print("Enter the first side of the triangle: ");
		side1 = kb.nextDouble();
		System.out.print("Enter the second side of the triangle: ");
		side2 = kb.nextDouble();
		System.out.print("Enter the third side of the triangle: ");
		side3 = kb.nextDouble();
		
		kb.close();
		
		// method call
		if (isValid(side1, side2, side3)) 
		{
           double area = area(side1, side2, side3);  // Method call to compute area
           System.out.printf("The area of the triangle is: %.2f\n", area);
        } 
		else 
        {
           System.out.println("The sides do not form a valid triangle.");
        }
	}
	
	
	public static boolean isValid(double side1, double side2, double side3)
	{
		if (side1 + side2 <= side3)
		{
			return false;
		}
		else if (side1 + side3 <= side2)
		{
			return false;
		}
		else if (side2 + side3 <= side1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	
	public static double area(double side1, double side2, double side3)
	{
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3)); 
		return area;
	}
	
}





/*
Write a program that asks the user to enter three sides for a triangle and computes the area if the input is valid.
The formula for computing the area of a triangle from its sides is:
XXXXXXXXXXXX
where side1, side2, and side3 are the three sides, and s=(side1+side2+side3)/2
The program should use the isValid and area methods with the following headers:

//the method returns true if the sum of any two sides is greater than the third side
public static boolean isValid (double side1, side2, side3)

//the methods returns the area of the triangle
public static double area(double side1, double side2, doubleside3)
*/