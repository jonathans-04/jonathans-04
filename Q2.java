import java.util.Scanner;

public class Q2 
{

	public static void main(String[] args)
	{
		// DECLARATION
		String s1, s2, s3, temp;
		
		// SCANNER
		Scanner kb = new Scanner(System.in);
		
		// INPUT
		System.out.print("Enter a word: ");
		s1 = kb.nextLine();
		System.out.print("Enter a word: ");
		s2 = kb.nextLine();
		System.out.print("Enter a word: ");
		s3 = kb.nextLine();
		
		// CONDITION
		if (s1.compareTo(s2) > 0)
		{
			temp = s1;
			s1 = s2;
			s2 = temp;
		}
		
		if (s2.compareTo(s3) > 0)
		{
			temp = s2;
			s2 = s3;
			s3 = temp;
		}
		
		if (s1.compareTo(s2) > 0)
		{
			temp = s1;
			s1 = s2;
			s2 = temp;
		}
		
		System.out.print(s1 + "\n" + s2 + "\n" + s3);
	}

}
