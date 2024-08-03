package assignment1;

import javax.swing.JOptionPane;

public class Leap_Year {

	public static void main(String[] args) {
		check(Integer.parseInt(JOptionPane.showInputDialog("Enter the Year ")));

	}

	public static void check(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.println(year + " is a Leap Year");
		else
			System.out.println(year + " is not a Leap Year");

	}
}
