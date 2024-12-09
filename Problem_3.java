import java.util.*;
public class Problem_3 
{

	public static void main(String[] args) 
	{
		// scanner
		Scanner kb = new Scanner (System.in);
		
		// declaration
		int number;
		
		// input
		System.out.print("Enter an integer: ");
		number = kb.nextInt();
		
		kb.close();
		
		// method call
		if (isPalindrome(number))
		{
			System.out.println(number + " is Palindrome.");
		}
		else
		{
			System.out.println(number + " is not Palindrome.");
		}

	}
	
	public static int reverse (int number)
	{
		int remainder, reversedNum = 0;
		while (number != 0)
		{
			remainder = number % 10;
			reversedNum = reversedNum * 10 + remainder;
			number /= 10;
		}
		return reversedNum;
	}
	
	public static boolean isPalindrome (int number)
	{
		int reversedNum = reverse(number);
		return number == reversedNum;
	}
}


/*
3.	A number is a palindrome if its reversal is the same as itself. 
Write a program that prompts the user to enter an integer and reports whether the integer is a palindrome. 
The program should use the reverse and isPalindrome methods with the following headers:

//the method returns the reversal of an integer, i.e, reverse(456) should return 654
public static int reverse (int number)

//the method returns true if number is a palindrome
public static boolean  isPalindrome (int number)



*/