package rd222dv_assign2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide an odd positive integer: ");
		int trSize = sc.nextInt();
		int y, z;
		// System.out.println("TrSize = " + trSize);

		if (trSize < 0 || trSize % 2 == 0) {
			System.out.println("The provided integer must be odd and positive!");
			System.exit(-1); // Exit program
		}
		System.out.println("Right-Angled Triangle: ");
		for (int i = 0; i <= trSize; i++) {
			for (y = trSize; y > i; y--) {
				System.out.print(" ");
			}
			for (z = 0; z < i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Isosceles Triangle: ");
		for (int i = 1; i <= trSize; i += 2) {
			for (int v = 0; v < (4 - i / 2); v++) {
				System.out.print(" ");
			}
			for (int w = 0; w < i; w++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
