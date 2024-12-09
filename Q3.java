import javax.swing.JOptionPane;

public class Q3 
{

	public static void main(String[] args) 
	{
		// INPUT
		String input1 = JOptionPane.showInputDialog("Enter the first test score:");
        String input2 = JOptionPane.showInputDialog("Enter the second test score:");
        String input3 = JOptionPane.showInputDialog("Enter the third test score:");
        
        // 
        int score1 = Integer.parseInt(input1);
        int score2 = Integer.parseInt(input2);
        int score3 = Integer.parseInt(input3);
        
        // CALCULATION
        int average = (score1 + score2 + score3) / 3;
		
		// PROCESSING
		 String grade;
		 if (average >= 90) 
		 {
	            grade = "A";
	     } else if (average >= 80) 
	     {
	            grade = "B";
	     } else if (average >= 70) 
	     {
	            grade = "C";
	     } else if (average >= 60) 
	     {
	            grade = "D";
	     } else 
	     {
	            grade = "F";
	     }
		
		// OUTPUT
		JOptionPane.showMessageDialog(null, "The average score is: " + average + "\nYour grade is: " + grade);

	}

}
