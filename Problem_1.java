// Problem 1

import java.util.*;

public class Problem_1 
{

	public static void main(String[] args) 
	{
		// scanner
		Scanner kb = new Scanner(System.in);
		
		
		// input
		System.out.print("Enter the size of the array: ");
		int s = kb.nextInt();	// size of the array
		
		int a[] = new int[s];	// declare array
		
		System.out.print("Enter the Array here: ");
		
		for (int i = 0; i < s; i++)	// populating the array
		{
			a[i] = kb.nextInt();
		}
		
		System.out.print("Enter the key: ");
		int key = kb.nextInt();
		
		kb.close();
		
		System.out.println("The number of times the key appears is " +searchKey(key, a));
	}
	
	public static int searchKey(int key, int a[])	// search key method
	{
		int num = 0;
		
		for (int i = 0; i < a.length; i++)	// loop to carry out selection in the whole array
		{
			if (key == a[i])	// checks if key is equal to the index in the array
			{
				num++;	// adds the same # of keys
				
			}
		}
		return num;
	}

}


/*
1.	Write a method that takes two arguments: an integer number (the key) and a 1D array of integers. 
The method should return the number of times that the key is repeated in the array. 
Write also a test program (the main method) that prompts the user to enter the key number and the one-dimensional array, 
calls the method, and displays the number of times that the key number appears in the array.
*/