package rd222dv_assign1;
import java.util.Scanner;
public class ShortName {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char dot = '.' ;
		String firstName;
		
		System.out.print("First Name: ");
		firstName = sc.next();
		
		
		String lastName;
		System.out.print("Last Name: ");
		lastName = sc.next();
		
		
		String sub = firstName.substring(0,1); // characters 1
		String sub1 = lastName.substring(0,4); // characters 1 to 4
		System.out.println("\nShort Name: "+sub+dot+' '+sub1);
		
		
		sc.close();
		
	}

}
