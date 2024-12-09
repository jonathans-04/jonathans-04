import java.util.Scanner;

public class Q1 
{

	public static void main(String[] args) 
	{
		// DECLARATION
		double num1, num2, num3, smallest;
				
		// SCANNER 
		Scanner kb = new Scanner(System.in);
				 
		// INPUT 
		System.out.print("Enter three numbers seperated by spaces: ");
		num1 = kb.nextDouble();
		num2 = kb.nextDouble();
		num3 = kb.nextDouble();
		
		kb.close();
		
		// CONDITION
		if ((num1 < num2) && (num1 < num3))
		{
			smallest = num1;
		}
		else
		{
			if (num2 < num3)
			{
				smallest = num2;
			}
			else
			{
				smallest = num3;
			}
		}
		// OUTPUT
		System.out.print("The smallest number is: " +smallest);

	}

}
