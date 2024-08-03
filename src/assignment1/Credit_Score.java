package assignment1;

import javax.swing.JOptionPane;

public class Credit_Score {

	public static void main(String[] args) {
		check_score(Integer.parseInt(JOptionPane.showInputDialog("Enter the Credit Score")));

	}

	public static void check_score(int score) {
		if (score < 400)
			System.out.println("Very Low Credit Score");
		else if (score >= 400 && score <= 600)
			System.out.println("Silver Card");
		else if (score >= 600 && score <= 800)
			System.out.println("Gold Card");
		else if (score >= 800 && score <= 850)
			System.out.println("Platinum Card");
		else
			System.exit(0);

	}

}
