package rd222dv_assign2;

public class Reverse {

	public static void main(String[] args) {
		char[] text = { '!', 'y', 's', 'a', 'E', ' ', 's', 'a', 'w', ' ', 's', 'i', 'h', 'T' };

		for (char c : text) {
			System.out.print(c);
		}
		for (int i = text.length - 1; i >= 0; i--) {
			System.out.print(text[i]);
		}
		//System.out.println();
	}

}
