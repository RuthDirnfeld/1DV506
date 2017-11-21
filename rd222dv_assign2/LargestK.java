package rd222dv_assign2;
import java.util.Scanner;
public class LargestK {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Give a positive integer:" );
		int i = sc.nextInt();
		int K = 0;
		int sum = 0;
		
		while (sum <= i) {
			K+=2;
				sum = sum + K;
		}
		System.out.println("The largest K such that 0+2+4+6+ ... K < "+i+" ==> "+"K="+(K-2));

sc.close();
	}

}
