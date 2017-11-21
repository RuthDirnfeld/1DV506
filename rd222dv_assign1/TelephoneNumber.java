package rd222dv_assign1;
import java.util.Random;
public class TelephoneNumber {

	public static void main(String[] args) {
		
Random rand = new Random();
		
		int Z, Y;
		
		Z = rand.nextInt(9) + 1;
		Y = rand.nextInt(99999);
		
		System.out.println("Random telephone number: 0XXX" + '-' + Z + Y);

	}

}
