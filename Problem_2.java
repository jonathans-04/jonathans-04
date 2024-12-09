import java.util.*;
public class Problem_2 
{

	public static void main(String[] args) 
	{
		// scanner
		Scanner kb = new Scanner(System.in);
		
		// declaration
		int size = 0;
		
		// input
		System.out.print("How many numbers do you want to enter? ");
		size = kb.nextInt();
		
		// declare array
		double [] ascorder = new double [size];
		
		// populate the array
		for (int i = 0; i < size; i++)
		{
			System.out.print("Enter number " +(i+1) + " here: ");
			ascorder[i] = kb.nextDouble();
		}
		
		kb.close();
		
		sortArray(ascorder);
		
		System.out.println("Sorted array: ");
		for (double num : ascorder)
		{
			System.out.print(num + " ");
		}
		
	}
	
	public static void sortArray(double [] ascorder)
	{
		int n = ascorder.length;	// allows for a shorter variable name
		boolean swapped;			// declares swapped as a boolean (true or false)	
		
		// outer loop - checks for # of passes
		for (int i = 0; i < n; i++)
		{
			swapped = false;
			
			for (int j = 0; j < n - 1; j++)		// inner loop + compares elements
			{
				if(ascorder[j] > ascorder[j+1])		// condition to swap or not elements
				{
					double temp = ascorder[j];
					ascorder[j] = ascorder[j+1];
					ascorder[j+1] = temp;
					swapped = true;
				}
			}
			
			if (!swapped)		// nested condition
			{
				break;
			}
			
		}
	}

}




/*
1.	Write a method that takes a 1D array of doubles as an argument, 
and that it returns the array sorted in ascending order. 
In this problem you have to write your own code to do the sorting (you can use the bubble-sort algorithm). 
Write also a test program (the main method) to demonstrate that the method works.
*/