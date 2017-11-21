package rd222dv_assign4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountChar {
	public static void main(String[] args) throws IOException {
		// Create an object representing a file
		File file = new File("D:\\lnu\\java_courses\\1DV506\\src\\rd222dv_assign4\\text.txt");
		// Create a Scanner reading from the file
		Scanner fileScan = new Scanner(file); // Might generate IOException
		// Read words from the file , one by one

		int up = 0;
		int low = 0;
		int white = 0;
		int other = 0;
		while (fileScan.hasNext()) { // true ==> more text available
			white++;
			String text = fileScan.next(); // read next word
			// String text = fileScan.nextLine(); // read next line
			for (int i = 0; i < text.length(); i++) {

				if ((Character.isUpperCase(text.charAt(i)))) {
					up++;
				} else if ((Character.isLowerCase(text.charAt(i)))) {
					low++;
				} else
					other++;

			}

		}
		System.out.println("Number of upper case letters: " + up);
		System.out.println("Number of lower case letters: " + low);
		System.out.println("Number of \"" + "whitespaces" + "\"" + ": " + white); //different number of whitespaces because I count every space between words
		System.out.println("Number of others: " + other);
		fileScan.close();
	}
}

