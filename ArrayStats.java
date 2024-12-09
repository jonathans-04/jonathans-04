public class ArrayStats 
{
	public static double[] arrayStats(double[] arr)	// Method definition
	{
		double[] stats = new double[3];	// Array to store [avg, min, max]
		
		// Initialize min and max
		double min = arr[0];
		double max = arr[0];
		double total = 0;
		
		// Calculate min, max, and total
		for (int i = 0; i < arr.length; i++)
		{
			double num = arr[i]; // Initialize the array
			total += num;
			if (num < min)
			{
				min = num;
			}
			if (num > max)
			{
				max = num;
			}
		}
		
		// Calculate average
		double average = total / arr.length;
		
		// Store results in the stats array
		stats[0] = average;
		stats[1] = min;
		stats[2] = max;
		
		// Return the stats array
		return stats;
		
	}
}
