// PROBLEM 6

import java.util.Scanner;

public class Q6 
{

	public static void main(String[] args) 
	{
		// declarations
		String word;
		Scanner kb = new Scanner(System.in);
		
		
		// input
		System.out.print("Enter a word: ");
		word = kb.nextLine();
		
		
		// processing and output
		word = word.toLowerCase();
		
		switch(word)
		{
		case "programming":
			System.out.println("Programming is the process or activity of writing computer programs.\n");
			break;
		case "websites":
			System.out.println("Websites are a set of related web pages located under a single domain name, typically produced by a single person or organization.\n");
			break;
		case "operating system":
			System.out.println("Operating systems are the software that supports a computer's basic functions, such as scheduling tasks, executing applications, and controlling peripherals.\n");
			break;
		case "virtual memory":
			System.out.println("Virtual memory is memory that appears to exist as main storage although most of it is supported by data held in secondary storage, transfer between the two being made automatically as required.\n");
			break;
		default:
			System.out.println(word + " is not in the dictionary");
		}

	}

}
