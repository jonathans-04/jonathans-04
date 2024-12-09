import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class Problem4
{
  
  public static void main(String[] args)
  {
    // scanner
    Scanner kb = new Scanner(System.in);
    
    // declaration
    int num = 0;
    
    // input
    System.out.print("Enter a integer greater than 1: ");
    num = kb.nextInt();
    
    // method call
    System.out.println(isPrime(2));
    
    // file writer
    try 
    {
    	FileWriter myWriter = new FileWriter("PrimeorNot.txt");
    	for (int i = 1; i < num; i++)
    	{
    		if(isPrime(i))
    		{
    			myWriter.write(String.valueOf(i) + "\n");
    		}
    	}
    	myWriter.close();
      } catch (IOException e) 
     {
        System.out.println("An error occurred.");
        e.printStackTrace();
     }
  }
  
  
  public static boolean isPrime(int num)
  {
	for(int i = 2; i < num-1; i++)
    {
      if (num % i == 0)
      {
        System.out.println("Not prime");
        return false;
      }
    }
    System.out.println("The number you entered is prime.");
    return true;
  }
  
}




/*
 * 1.	A prime number is a number that is only evenly divisible by itself and 
 * 1. For example, the number 5 is prime because it can only be evenly divided (that is with a remainder of zero) by 1 and 5. 
 * The number 6 is not prime because it can be evenly divided by 1, 2, 3, and 6. 
 * Write a Java program that ask the user for an integer number a writes to a file the prime numbers between 1 and the number entered by the user. 
 * The program should include a method named isPrime that takes an integer number as an argument and returns true if the argument is prime, 
 * and false if the argument is not prime.
*/