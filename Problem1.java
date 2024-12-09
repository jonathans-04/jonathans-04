/*
1.Write a Java application that:
a.asks the user for the daily sales for each day of a week using a repetition loop 
  and calculates its total.
b.calculates the average daily sales for the week
c.displays the total and average sales for the week. 
 */


import java.util.*;


public class Problem1 
{

	public static void main(String[] args) 
	{
	  int totalSales = dailySales();	// Stores the total from dailySales() method
	  
      double averageSales = calcAverageSales(totalSales);	// Stores the average from calcAverageSales() method
      
      displayTotalandAverage(totalSales, averageSales);	// Displays output from method displayTotalandAverage
		
		
	}
	// part A
  	public static int dailySales()
    {
      	// scanner
      	Scanner kb = new Scanner(System.in);
      	
      	// declarations
    	int dailySales, total;
		total = 0;
      	// method a LOOP
		for (int i = 0; i < 7; i++)
		{
			System.out.print("What were the sales for today? ");
			dailySales = kb.nextInt();
			
			total += dailySales;	// Totals weekly sales
			
		}
		return total; // Returns total to any method that calls this method (in this case main)
    }
  	
  	// part B
	public static double calcAverageSales(int total)
    {
      double average;
      average = total / 7;
  	  return average;
    }
  
   // part C
   public static void displayTotalandAverage(int total, double average)
   {
     System.out.println("Total sales for the week are: $" + total);
	 System.out.println("Average sales for the week are: $" + average);
     
   }
  
  
}
