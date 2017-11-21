package rd222dv_assign4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DrunkWalk {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int fell = 0;
		
		try{
		System.out.print("Enter the size: ");
		int planeSize = sc.nextInt();
		if (planeSize <=0) {
			throw new Exception ("Enter size bigger than 0");
		}	
		System.out.print("Enter the number of Steps: ");
		int maxStep = sc.nextInt();
		if (maxStep <=0)
			throw new Exception ("Enter a number of Steps bigger than 0");
		
		System.out.print("Enter the number of walks: ");
		int walk = sc.nextInt();
		if (walk <=0)
			throw new Exception ("Enter a number of walks bigger than 0");
		
		RandomWalk drunk = new RandomWalk(maxStep, planeSize);
		
		for (int i = 0; i < walk; i++) {
			
			drunk.walk();
			
			if (drunk.moreSteps()) {
				fell++;
			}
			drunk.reset();
		}
		double fallers = (fell*100f) / walk;
		NumberFormat formatter = new DecimalFormat("#0.00");
		
		System.out.println("Out of "+walk+" drunk people "+formatter.format(fallers)+" fell into the water");
			
		}catch (InputMismatchException exc){
			exc.printStackTrace();
			
		}catch (Exception exc){
			exc.printStackTrace();
			
		}
		finally {
			sc.close(); //if no exception occurred
		}
	}

}
