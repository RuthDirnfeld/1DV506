package rd222dv_assign2;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide 10 integers: ");

		int largest = 0;
		int secondLargest = 0;

		for (int i = 0; i < 9; i++) {

			int num = sc.nextInt();

			if (num > largest) {
				secondLargest = largest;
				largest = num;
			}

			else if (num > secondLargest) {
				secondLargest = num;
			}
		}
		System.out.println("The second largest is: " + secondLargest);

		sc.close();
	}
}
