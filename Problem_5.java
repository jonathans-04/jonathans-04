import java.util.*;
public class Problem_5 
{

	public static void main(String[] args) 
	{
		// Scanner
		Scanner kb = new Scanner(System.in);
		
		// Input
		System.out.print("How many numbers would you like to enter? ");
		int size = kb.nextInt();
		
		// Array
		double [] arr = new double [size];
		
		// Populate the array
		for (int i = 0; i < size; i++)
		{
			System.out.print("Enter number " +(i+1) +" here: ");
			arr[i] = kb.nextDouble();
		}
		
		// Call arrayStats method
		double [] stats = ArrayStats.arrayStats(arr);
		
		// Output
		System.out.println("The lowest number in the array is: " +stats[1]);
		System.out.println("The highest number in the array is: " +stats[2]);
		System.out.println("The average of the elements in the array is: " +stats[0]);
		
		kb.close();
		
	}
	
	
}



/*
 * 1.	Write a program to calculate the average, the maximum 
 * and the minimum element of a 1D array of doubles. 
 * The program should use a method called arrayStats that takes a 1D array of doubles as an argument 
 * and returns a 1D array of doubles containing the average, the maximum 
 * and the minimum element of the array. 
 * Write a test program (the main method) that prompts the user to enter a one-dimensional array, 
 * calls the arrayStats method, and displays the average, maximum and minimum element of the array. 
*/

// main method (should be the test program)
// array stats method
// array should be an array of doubles
// input: enter a 1d array
// call the arrayStats method and display the avg, max, and min elements of the array