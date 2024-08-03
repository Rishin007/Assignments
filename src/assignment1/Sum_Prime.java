package assignment1;

import javax.swing.JOptionPane;

public class Sum_Prime {

	public static void main(String[] args) {
		prime_addition(Integer.parseInt(JOptionPane.showInputDialog("Enter the Number")));

	}

	public static void prime_addition(int num) {
		int i, n, a = num, sum = 0;
		while (num > 0) {
			int c = 0;
			n = num % 10;
			for (i = 1; i <= n; i++) {
				if (n % i == 0)
					c++;
			}
			if (c == 2)
				sum += n;
			num /= 10;
		}
		System.out.println("The Number is: " + a);
		System.out.println("The Sum of the prime digits are " + sum);
	}

}
