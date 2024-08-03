package assignment1;

import javax.swing.JOptionPane;

public class Reverse {

	public static void main(String[] args) {
		reverse(Integer.parseInt(JOptionPane.showInputDialog("Enter the Number")));

	}

	public static void reverse(int num) {
		int rev, reverse = 0, a = num;
		while (num > 0) {
			rev = num % 10;
			reverse = (reverse * 10) + rev;
			num /= 10;
		}
		System.out.println("The Reverse of " + a + " is " + reverse);
	}

}
