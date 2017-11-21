package rd222dv_assign3;

public class Point {

	private int xPos = 0;
	private int yPos = 0;
	double distance;

	public Point() {

	}

	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	public String toString() {
		String str = xPos + "," + yPos;

		return str;
	}

	public void setX(int x) {
		xPos = x;
	}

	public void setY(int y) {
		yPos = y;
	}

	public boolean isEqualTo(Point p2) {
		// System.out.println("Is "+xPos+"="+p2.getxPos());
		// System.out.println("Is "+yPos+"="+p2.getyPos());
		if (xPos == p2.getxPos() && yPos == p2.getyPos()) {
			return true;
		}
		return false;
	}

	public double distanceTo(Point p2) {
		distance = Math.sqrt(Math.pow(xPos - p2.getxPos(), 2) + Math.pow(yPos - p2.getyPos(), 2));

		return distance;
	}

	public void move(int dx, int dy) {
		setX(xPos + dx);
		setY(yPos + dy);
	}

	public void moveToXY(int x, int y) {
		setX(x);
		setY(y);
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
}
