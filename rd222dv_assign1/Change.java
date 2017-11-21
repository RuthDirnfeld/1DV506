package rd222dv_assign1;
import java.util.Scanner;
public class Change {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Payment: ");
		double payment = sc.nextDouble();
		
		int p = (int)Math.round(price);
		int p1 = (int)Math.round(payment);
		
		int change = p1 - p;
		System.out.print("\nChange: "+change+' '+"kronor");
		
		int tusen = change/1000;
	    change=change%1000;
	    int fhundra = change/500;
	    change=change%500;
	    int hundra = change/100;
	    change=change%100;
	    int femtio = change/50;
	    change=change%50;
	    int tjugo = change/20;
	    change=change%20;
	    int tio = change/10;
	    change=change%10;
	    int fem = change/5;
	    change=change%5;
	    int ett = change/1;
	   
	    
	    System.out.println("\n1000kr bills: " + tusen);
	    System.out.println("500kr bills: " + fhundra);
	    System.out.println("100kr bills: " + hundra);
	    System.out.println("50kr bills: " + femtio);
	    System.out.println("20kr bills: " + tjugo);
	    System.out.println("10kr coins: " + tio);
	    System.out.println("5kr coins: " + fem);
	    System.out.println("1kr coins: " + ett);
	    
	    sc.close();
	}

}
