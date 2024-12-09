import java.util.*;


public class Problem3 
{

	public static void main(String[] args) 
    {
		// declaration
      	double meters;
		
		// scanner
		
		Scanner kb = new Scanner (System.in);
		
		
		// gather input
		
		System.out.print("Enter a distance (in meters): ");
		meters = kb.nextDouble();
      
		kb.nextLine();
      	// menu
      String choice = "";
		while(!choice.equals("d")) 
		{
			System.out.println("Menu: ");
			System.out.println("a. Convert to kilometers");
			System.out.println("b. Convert to inches");
			System.out.println("c. Convert to feet");
			System.out.println("d. Exit the program");
			choice = kb.nextLine();
			
			switch(choice.charAt(0)) 
			{
			case 'a':
				convertKilometers(meters);
                break;
			case 'b':
				convertInches(meters);
                break;
			case 'c':
				convertFeet(meters);
                break;
			case 'd':
				System.out.println("You have exited the program.");
                break;
				
			}
		}
      	
	}
	
	
	// convert to kilometers
	public static double convertKilometers(double meters)
	{
		double kilometers = 0.001 * meters;
		System.out.println(meters + " meters converted to kilometers = " + kilometers);
		return kilometers;
	}
	
	
	// convert to inches
	public static double convertInches(double meters)
	{
		double inches = 39.37 * meters;
		System.out.println(meters + " meters converted to inches = " + inches);
		return inches;
	}
	
	
	// convert to feet
	public static double convertFeet(double meters)
	{
		double feet = 3.281 * meters;
		System.out.println(meters + " meters converted to feet = " + feet);
		return feet;
	}
	
	
	// quit the program

}





/*
3.	Write a Java program that asks the user to enter a distance in meters. The program will then present the following menu of selections:
a.	Convert to kilometers
b.	Convert to inches
c.	Convert to feet
d.	Quit the program

The program will convert the distance to kilometers (=meters*0.001), inches (=meters*39.37) or feet (=meters*3.281),
depending on the user’s selection. Each conversion should be handled by a separate method that takes the distance in meters as an argument.
*/