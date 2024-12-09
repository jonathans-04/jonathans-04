
import java.util.Scanner;

public class Q4 
{

	public static void main(String[] args) 
	{
		// declaration
		double income;
		double tax;
		Scanner kb = new Scanner(System.in);
		
		// input
		System.out.print("Enter your taxable income: ");
		income = kb.nextDouble();
		
		// processing and output
		if (income < 20000)
		{
			tax = income * .02; //2% tax
		}
		else if (income <=50000)
		{
			tax = income * .03; //3% tax
		}
		else
		{
			tax = income * .05; //5% tax
		}
		
		// output
		System.out.println("Your taxes due are: $" + tax);

	}

}
