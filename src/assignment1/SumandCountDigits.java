package assignment1;

import javax.swing.JOptionPane;

public class SumandCountDigits {

	public static void main(String[] args) {
		addition(Integer.parseInt(JOptionPane.showInputDialog("Enter the Number")));

	}

	public static void addition(int num) {
		int rev, c = 0, sum = 0, a = num;
		while (num > 0) {
			c++;
			rev = num % 10;
			sum = sum + rev;
			num /= 10;
		}
		System.out.println("The Sum of the digits of " + a + " is : " + c);
		System.out.println("The Sum of " + a + " is : " + sum);
	}

}
