package assignment1;

import javax.swing.JOptionPane;

public class Create_Array {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the Array Limit"));
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++)
			ar[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the Array Elements"));
		System.out.println("The Created Array is :");
		for (int i = 0; i < ar.length; i++)
			System.out.println(ar[i]);
	}

}
