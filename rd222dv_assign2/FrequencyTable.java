package rd222dv_assign2;

import java.util.Random;

public class FrequencyTable {

	public static void main(String[] args) {
		Random rand = new Random();

		int[] dice = new int[7];
		int[] roll = new int[6000];

		for (int i = 0; i < 6000; i++) {
			roll[i] = 1 + rand.nextInt(6);
			dice[roll[i] - 1]++;

			if (roll[i] == 1) {
				dice[0]++;
			} else if (roll[i] == 2) {
				dice[1]++;
			} else if (roll[i] == 3) {
				dice[2]++;
			} else if (roll[i] == 4) {
				dice[3]++;
			} else if (roll[i] == 5) {
				dice[4]++;
			} else if (roll[i] == 6) {
				dice[5]++;
			}
		}
		System.out.print("\nFrequencies when rolling a dice 6000 times. ");
		System.out.print("\n1: " + (dice[0] / 2));
		System.out.print("\n2: " + (dice[1] / 2));
		System.out.print("\n3: " + (dice[2] / 2));
		System.out.print("\n4: " + (dice[3] / 2));
		System.out.print("\n5: " + (dice[4] / 2));
		System.out.print("\n6: " + (dice[5] / 2));
		

	}

}