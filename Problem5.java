import java.util.Scanner;

public class Problem5 
{

	public static void main(String[] args) 
	{
		// scanner
		Scanner kb = new Scanner(System.in);
		
		// declaration
		String menuItem;
		
		double gramsofFat = 0;
		double gramsofCarbs = 0;
		double gramsofProtein = 0;
		double caloriesFromFat = 0;
		double caloriesFromCarbs = 0;
		double caloriesFromProtein = 0;
		double totalCalories = 0;
		double totalCaloriesFromFat = 0;
		
		
		
		// input
		System.out.print("What menu item did you eat? ");
		menuItem = kb.nextLine();
		
		System.out.print("How many grams of fat did the item have? ");
		gramsofFat = kb.nextDouble();
		
		System.out.print("How many grams of carbohydrates did the item have? ");
		gramsofCarbs = kb.nextDouble();
		
		System.out.print("How many grams of protein did the item have? ");
		gramsofProtein = kb.nextDouble();
		
		// calculation
		caloriesFromFat = gramsofFat * 9;
		caloriesFromCarbs = gramsofCarbs * 4;
		caloriesFromProtein = gramsofProtein * 4;
		totalCalories = caloriesFromFat + caloriesFromCarbs + caloriesFromProtein;
		totalCaloriesFromFat = (caloriesFromFat / totalCalories) * 100;
		
		// output
		System.out.printf("The meal you consumed had %.0f calories and %.2f%% of calories came from fat.\n", totalCalories, totalCaloriesFromFat);


	}

}
