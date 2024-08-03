package assignment1;

import javax.swing.JOptionPane;

public class Even_Odd {

	public static void main(String[] args) {
		int a = (Integer.parseInt(JOptionPane.showInputDialog("Enter the Number")));
		num_check(a);

	}

	public static void num_check(int n) {
		if (n > 0) {
			if (n % 2 == 0)
				System.out.println("The Given Number " + n + " is Even ");
			else
				System.out.println("The Given Number " + n + " is Odd ");
		} else
			System.out.println("Please Make sure No. is greater than 0");
	}

}
