package assignment1;

import javax.swing.JOptionPane;

public class EvenArraySum {

	public static void main(String[] args) {

		create_Array(Integer.parseInt(JOptionPane.showInputDialog("Enter the Array Limit")));
	}

	public static void create_Array(int n) {

		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++)
			ar[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the Array Elements"));
		display_Array(ar);
		sum_Array(ar);
	}

	public static void display_Array(int ar[]) {
		System.out.println("The Created Array is :");
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");
	}

	public static void sum_Array(int ar[]) {
		int sum = 0, sum_odd = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0)
				sum += ar[i];
			else
				sum_odd += ar[i];
		}
		System.out.println("\n**************************");
		System.out.println("Sum of the even elements are : " + sum);
		System.out.println("Sum of the odd elements are : " + sum_odd);
	}

}
