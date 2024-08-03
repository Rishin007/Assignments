package assignment1;

import javax.swing.JOptionPane;

public class Positive_Negative {

	public static void main(String[] args) {

		create_Array(Integer.parseInt(JOptionPane.showInputDialog("Enter the Array Limit")));
	}

	public static void create_Array(int n) {

		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++)
			ar[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the Array Elements"));
		display_Array(ar);
		sum(ar);
	}

	public static void display_Array(int ar[]) {
		System.out.println("The Created Array is :");
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");
	}

	public static void sum(int ar[]) {
		int sp = 0, sn = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > 0)
				sp += ar[i];
			else
				sn += ar[i];
		}
		System.out.println("\nThe Sum of Positive Nos. are :" + sp);
		System.out.println("The Sum of Positive Nos. are :" + sn);
	}

}
