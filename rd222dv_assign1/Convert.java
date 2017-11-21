package rd222dv_assign1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Convert {

	public static void main(String[] args) {
	
		double F; //F = Fahrenheit
	    Scanner sc = new Scanner(System.in);      
	    DecimalFormat dFormat = new DecimalFormat("0.#");
	    
	    System.out.println("Enter temperature in Fahrenheit:");
	    F = sc.nextDouble();
	    F = ((F - 32)*5)/9; //formula
	    
	    String one_decimal = dFormat.format(F);
	    System.out.println("Temperature in Celsius: " + one_decimal);
		
sc.close();

	}

}
