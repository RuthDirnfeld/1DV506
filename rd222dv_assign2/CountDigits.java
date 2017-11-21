package rd222dv_assign2;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		int oddNum = 0;
		int evenNum = 0;
		int zero = 0;

		System.out.print("Provide a positive integer: ");
		num = sc.nextInt();

		while (num > 0) {

			if ((num % 10) == 0) {
				zero++;	
			} else if (num % 2 == 0) { 
				evenNum++;		
			} else {
				oddNum++;	
			}

			num /= 10;
		}
		System.out.print("\nZeros: " + zero);
		System.out.print("\nEven: " + evenNum);
		System.out.print("\nOdd: " + oddNum);

		sc.close();
	}

}
