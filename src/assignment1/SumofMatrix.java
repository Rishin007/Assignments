package assignment1;

import javax.swing.JOptionPane;

public class SumofMatrix {

	public static void main(String[] args) {
		int m = Integer.parseInt(JOptionPane.showInputDialog("Enter the Row Limit"));
		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the Column Limit"));
		int ar[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				ar[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter the Matrix Elements"));
		}
		System.out.println("The Created Matrix is :");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(ar[i][j] + " ");
			System.out.println();

		}
		int ar2[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				ar2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter the Matrix Elements"));
		}
		System.out.println("The Created Matrix is :");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(ar2[i][j] + " ");
			System.out.println();
		}
		int sum[][] = new int[m][n];
		System.out.println("The Sum of Matrixes is : ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				sum[i][j] = ar[i][j] + ar2[i][j];
				System.out.print((sum[i][j]) + " ");
			}
			System.out.println();
		}
	}
}
