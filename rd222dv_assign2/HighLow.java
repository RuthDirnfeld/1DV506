package rd222dv_assign2;

import java.util.Scanner;
import java.util.Random;

public class HighLow {

	public static void main(String[] args) {
		int correctNumber;
		int counter = 0;
		int userGuess;

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		correctNumber = rand.nextInt(99) + 1;
		System.out.println("Please guess a number between 1 and 100: ");
		boolean notGameOver = true;

		while (notGameOver) {
			userGuess = sc.nextInt();
			counter++;
			if (userGuess > correctNumber) {
				System.out.println("Guess " + counter + ": " + userGuess + "\nClue: lower");
			} else if (userGuess < correctNumber) {
				System.out.println("Guess " + counter + ": " + userGuess + "\nClue: higher");
			} else if (userGuess == correctNumber) {
				System.out.println("Correct answer after only " + counter + " guesses");
			}

			if (counter >= 10) {
				System.out.println("You ran out of options");
				notGameOver = false;
			}

		}
		sc.close();
	}
}
