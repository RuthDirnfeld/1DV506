package rd222dv_assign1;
import java.util.Scanner;
public class Time {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h; //hours
		int m; //minutes
		int s; //seconds
		
		System.out.println("Give a number of seconds: ");
		s = sc.nextInt();
		h = (s / 3600);
		m = (s % 3600) / 60;
		s = (s % 3600) % 60;
		
		System.out.println("This corresponds to: "+h+"hours "+m+"minutes "+s+"seconds ");
		
		sc.close();
		
		
	}

}
