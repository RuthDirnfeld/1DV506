package rd222dv_assign1;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class WindChill {

	public static void main(String[] args) {
		double T, WS, WCT;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat dFormat = new DecimalFormat("0.#");
		    		
	    System.out.print("Temperature: ");
	    T = sc.nextDouble(); //Temperature
	    System.out.print("Wind Speed: ");
	    WS = sc.nextDouble(); //Wind Speed
	    
	    WCT = (33 + (T - 33) * ( 0.474 + 0.454 * Math.sqrt(WS) - 0.0454 * WS)); //Formula for calculating Wind Chill
	    
	    String one_decimal = dFormat.format(WCT);
	    System.out.println("\nWind Chill Temperature: "+one_decimal);
		
	    sc.close();
	}

}
