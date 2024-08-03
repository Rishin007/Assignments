package assignment1;

import javax.swing.JOptionPane;

public class Matrix {

	public static void main(String[] args) {

		create_Matrix(Integer.parseInt(JOptionPane.showInputDialog("Enter the Row Limit")),
				Integer.parseInt(JOptionPane.showInputDialog("Enter the Column Limit")));

	}

	public static void create_Matrix(int n, int m) {

		int ar[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				ar[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter the Matrix Elements"));
		}

		display_Matrix(ar, m, n);

	}

	public static void display_Matrix(int ar[][], int m, int n) {
		System.out.println("The Created Matrix is :");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(ar[i][j] + " ");
			System.out.println();
		}
	}

}
