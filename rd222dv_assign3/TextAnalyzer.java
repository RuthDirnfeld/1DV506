package rd222dv_assign3;

public class TextAnalyzer {

	private String text;
	private int character;
	private int upperCase;
	private int whiteSpace;
	private int digit;

	public TextAnalyzer(String text) {
		this.text = text;
	}

	public int charCount() {
		for (int i = 0; i < text.length(); i++) {
			character++;
		}
		return character;
	}

	public int upperCaseCount() {
		for (int i = 0; i < text.length(); i++) {
			if (Character.isUpperCase(text.charAt(i))) {
				upperCase++;
			}
		}
		return upperCase;
	}

	public int whitespaceCount() {
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				whiteSpace++;
			}
		}
		return whiteSpace;
	}

	public int digitCount() {
		for (int i = 0; i < text.length(); i++) {
			if (Character.isDigit(text.charAt(i))) {
				digit++;
			}
		}
		return digit;
	}

	public boolean containsChar(char c) {
		char arr[] = text.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (c == arr[i])
				return true;
		}
		return false;
	}

	public boolean containsString(String search) {
		if (text.contains(search)) {
			return true;
		}
		return false;
	}
}