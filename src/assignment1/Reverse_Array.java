package assignment1;

import javax.swing.JOptionPane;

public class Reverse_Array {

	public static void main(String[] args) {

		create_Array(Integer.parseInt(JOptionPane.showInputDialog("Enter the Array Limit")));
	}

	public static void create_Array(int n) {

		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++)
			ar[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the Array Elements"));
		display_Array(ar);
		reverse_Array(ar);
	}

	public static void display_Array(int ar[]) {
		System.out.println("The Created Array is :");
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");
	}

	public static void reverse_Array(int ar[]) {
		System.out.println("\nThe Array in Reverse is : ");
		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.print(ar[i] + " ");
		}
	}

}
