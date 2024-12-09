import java.util.*;

public class Problem2 
{

	public static void main(String[] args) 
	{
		// Scanner
				Scanner kb = new Scanner(System.in);
				
				
				// Declarations
				int wallSpace = 0, gallonsOfPaint = 0;
				double laborHours, priceOfPaint = 0, laborCost, totalCost = 0, paintCost = 0;
				
				// Input for wall space
				System.out.print("How much wall space do you want to paint? ");
				wallSpace = kb.nextInt();
				
				
				// Input for price of paint
				System.out.print("What is the price of paint? ");
				priceOfPaint = kb.nextDouble();
				
				
				// Calc gallons of paint
				gallonsOfPaint = wallSpace / 115;
				
				
				// Calc labor hours
				laborHours = wallSpace / 115 * 8;
				
				
				// Calc price of paint
				paintCost = priceOfPaint * gallonsOfPaint;
				
				
				// Calc labor cost
				laborCost = laborHours * 18;
				
				
				// Calc total cost
				totalCost = laborCost + paintCost;
				
				
				// method call
				paintRequired(gallonsOfPaint);
				laborRequired(laborHours);
				costofPaint(paintCost);
				totalLaborCharge(laborCost);

			}
			
			// a. The number of gallons of paint required
			public static void paintRequired(int gallonsOfPaint)
			{
				System.out.println("The amount of paint required is " + gallonsOfPaint + " gallons.");
			}
			
			
			//c. Cost of paint
			public static void costofPaint(double paintCost)
			{
				System.out.println("The cost of paint is $" + paintCost);
			}

			
			// c. Labor hours required
			public static void laborRequired(double laborHours)
			{
				System.out.println("The hours of labor required are " + laborHours + " hours.");
			}
			
			
			// d. Labor charges
			public static void totalLaborCharge(double laborCost)
			{
				System.out.println("The labor charges are $" + laborCost);
			}
			
			
			// e. Total Cost
			public static void jobCost(double totalCost)
			{
				System.out.println("The total cost for this job will be $" + totalCost);
			}
}




