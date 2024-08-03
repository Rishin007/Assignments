package assignment1;

import javax.swing.JOptionPane;

public class Duck_Number {

	public static void main(String[] args) {
		if (duck(Integer.parseInt(JOptionPane.showInputDialog("Enter the Number "))))
			System.out.println(" It is a Duck Number");
		else
			System.out.println(" It is not a Duck Number");

	}

	public static boolean duck(int num) {

		while (num > 0) {
			if (num % 10 == 0)
				return true;
			else
				num /= 10;
		}
		return false;

	}
}
