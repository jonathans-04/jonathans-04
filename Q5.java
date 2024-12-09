import java.util.Scanner;

public class Q5 
{

	public static void main(String[] args) 
	{
		// declaration
		String result;
		int year;
		Scanner kb = new Scanner(System.in);
		
		// input
		System.out.print("Enter a year: ");
		year = kb.nextInt();
		
		// processing and output
		if (year % 400 == 0)
		{
			result = year + " is a leap year.";
		}
		else if (year % 100 == 0)
		{
			result = year + " is not a leap year.";
		}
		else if (year % 4 ==0)
		{
			result = year + " is a leap year.";
		}
		else
		{
			result = year + " is not a leap year.";
		}
		
		// output
		System.out.print(result);

	}

}
