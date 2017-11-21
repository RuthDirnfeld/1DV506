package rd222dv_assign1;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your length in meters: ");
		double length = 0.0; //length
		length = sc.nextDouble();
		
		System.out.println("Enter your weight in kilograms: ");
		double weight = 0.0; //weight
		weight = sc.nextDouble();
		
		double bmi = 0.0;
		bmi = weight / (length*length); //formula for calculating BMI
		System.out.println("Your BMI is: " + Math.round(bmi));
		
		sc.close();
		
		
		
	}

}
