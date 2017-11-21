package rd222dv_assign1;
import java.util.Scanner;
public class Seconds {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Hours: ");
		int h = 1; //hours
		h = sc.nextInt();
		
		System.out.print("Minutes: ");
		int m = 1; //minutes
		m = sc.nextInt();
		
		System.out.print("Seconds: ");
		int s = 1; //seconds
		s = sc.nextInt();
		
		int sum = (h * 3600) + (m * 60) + s;
		System.out.println("Total time measured in seconds: " +sum);
		
		sc.close();

		
		
		
		
		
	}

}
