package rd222dv_assign2;
import java.util.Scanner;
public class Backwards {

	public static void main(String[] args) {
		System.out.println("Provide a line of text: ");
		Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        String reverse = "";
        
        for(int i=str.length()-1; i>=0; i--)
            reverse += str.charAt(i);
        System.out.println("Backwards: " + reverse);   
        
        sc.close();

	}

}
