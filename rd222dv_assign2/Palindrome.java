package rd222dv_assign2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String text, reverse = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to check if it is a palindrome");
		text = sc.nextLine();
		text = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

		int length = text.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + text.charAt(i);

		if (text.equals(reverse))
			System.out.println("Palindrome: " + text);
		else
			System.out.println("Not a palindrome.");
		sc.close();
	}
}