import java.util.Scanner;


public class Problem_6 
{

	public static void main(String[] args) 
	{
		// declaration
		double organisms = 0;
		int days = 0;
		double growthRate = -1;
		
		
		// scanner
		Scanner kb = new Scanner (System.in);
		
		// organisms input
		while (organisms < 2)
		{
			System.out.print("Enter number of organisms:  ");
			organisms = kb.nextDouble();
		}
		// growthRate input
		while (growthRate < 0)
		{
			System.out.print("Enter growth rate (as a percentage): ");
			growthRate = kb.nextDouble();
		}
		// days input validation
		while (days < 1)
		{
			System.out.print("Enter number of days: ");
			days = kb.nextInt();
		}
		for (int i = 0; i <= days; i++)
		{
			System.out.println("After " + (i+1) + " days, you have " + organisms + " organisms.");
			organisms += (growthRate * organisms) / 100;
		}
		
		
		
		

	}

}

/*
 * while loop can execute infinite times
 * for loop we know how many times it will execute
 */
