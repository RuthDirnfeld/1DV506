package rd222dv_assign1;
import java.util.Scanner;
public class SumOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Provide a three digit number: ");
		
		int num1, num2, num3, num4, digit, sum;
		digit = sc.nextInt();
		
		num1 = digit / 100;
		num2 = digit % 100;
		num3 = num2 / 10;
		num4 = digit % 10;
		
		sum = num4 + num3 + num1;
		
		System.out.println("Sum of digits: "+sum);
		
		sc.close();
	}
	

}
