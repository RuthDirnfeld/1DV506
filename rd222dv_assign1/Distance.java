package rd222dv_assign1;
import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Distance {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, distance;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat dFormat = new DecimalFormat("0.###");
	
		
		System.out.print("Enter x1: ");
		x1 = sc.nextDouble();
		
		System.out.print("Enter y1: ");
		y1 = sc.nextDouble();
		
		System.out.print("Enter x2: ");
		x2 = sc.nextDouble();
		
		System.out.print("Enter y2: ");
		y2 = sc.nextDouble();
		
		distance = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2, 2));
		
		String three_decimals = dFormat.format(distance);
		
		System.out.println("Distance: "+three_decimals);
		
		sc.close();
		
	}

}
