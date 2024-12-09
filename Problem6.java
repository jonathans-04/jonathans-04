import java.util.Scanner;

public class Problem6 
{

	public static void main(String[] args) 
	{
		// scanner
		Scanner kb = new Scanner(System.in);
		
		// declaration
		int checks = 0;
		double serviceFees = 10;
		
		// input
		System.out.print("How many checks have you wrote this month? ");
		checks = kb.nextInt();
		
		// processing
		if (checks < 20)
		{
			serviceFees += (checks * .10);
		}
		if (checks >= 20 && checks < 40)
		{
			serviceFees += (checks * .08);
		}
		if (checks >= 40 && checks < 60)
		{
			serviceFees += (checks * .06);
		}
		if (checks >= 60)
		{
			serviceFees += (checks * .04);
		}
		System.out.print("The bank's services fees for this month are " + serviceFees);

	}

}









/*
6.	A bank charges a base fee of $10 per month, plus the following check fees for a commercial banking account:
$.10 each for less than 20 checks
$.08 each for 20-39 checks
$.06 each for 40-59 checks
$.04 each for 60 or more checks.
	
Create a Java application that asks for the number of checks written for the month. The application should then calculate and display the bank’s services fees for the month.
*/