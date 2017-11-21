package rd222dv_assign2;

import java.util.Scanner;

public class CountA {

	public static void main(String[] args) {
		System.out.println("Provide a line of text: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int lowcase = 0;
		int upcase = 0;

		for (int nA = 0; nA < text.length(); nA++) {
			char c = text.charAt(nA);
			if (c == 'A')
				upcase++;
			else if (c == 'a')
				lowcase++;
		}
		System.out.print("\nNumber of 'A': " + upcase);
		System.out.print("\nNumber of 'a': " + lowcase);

		sc.close();
	}

}
