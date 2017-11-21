package rd222dv_assign2;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		ArrayList<Integer> values = new ArrayList<Integer>();

		// Read inputs

		System.out.println("Enter positive integers. End by giving a negative integer. ");
		Scanner sc = new Scanner(System.in);
		int element = 0;
		int counter = 0;
		while (element >= 0) { //exit when smaller than 0
			System.out.print("Integer" + (counter + 1) + ": ");
			element = sc.nextInt();
			values.add(element);
			counter++;
		}
		System.out.println("Number of positive integers: " + (counter-1));
		System.out.print("In reverse order: ");
		for (int i = values.size() - 2; i >= 0; i--) {
			int num = values.get(i);
			System.out.print(" " + num);
		}
		while (element < 0) {
			System.exit(-1);
		}

		System.out.println();
		sc.close();
	}

}
