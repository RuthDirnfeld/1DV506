package rd222dv_assign3;

public class MultiDisplay {

	private String displayMessage;
	private int displayCount = 1;

	public MultiDisplay() {

	}

	public void setDisplayMessage(String msg) {
		displayMessage = msg;
	}

	public void setDisplayCount(int n) {
		displayCount = n;

	}

	public void display() {
		for (int i = 0; i < displayCount; i++) {
			System.out.println(displayMessage);
		}
	}

	public String getDisplayMessage() {

		return displayMessage;
	}

	public int getDisplayCount(int n) {

		return displayCount;
	}

	public void display(String msg, int n) {
		displayMessage = msg;
		displayCount = n;
		for (int i = 0; i < n; i++) {
			System.out.println(msg);
		}
	}

}
