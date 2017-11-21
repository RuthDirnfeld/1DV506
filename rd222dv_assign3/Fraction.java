package rd222dv_assign3;

public class Fraction {
	private int Numerator;
	private int Denominator;

	public Fraction() {

	}

	public Fraction(int n, int d) {
		setNumerator(n);
		setDenominator(d);
	}

	public int getNumerator() {
		return Numerator;
	}

	public int getDenominator() {
		return Denominator;
	}

	public void setN(int n) {
		Numerator = n;
	}

	public void setD(int d) {
		if (check(d, "Denominator"))
			Denominator = d;
	}

	public void setNumerator(int Numerator) {
		this.Numerator = Numerator;
	}

	public void setDenominator(int Denominator) {
		this.Denominator = Denominator;
	}

	public boolean isNegative(int n, int d) {
		if (n < 0 || d < 0) {
			return true;
		} else
			return false;
	}

	Fraction add(Fraction frac2) {
		int newN = (Numerator * frac2.getDenominator()) + (frac2.getNumerator() * Denominator);
		// System.out.println("Is "+Numerator+" is "+Denominator);
		int newD = Denominator * frac2.getDenominator();
		// System.out.println("Is "+frac2.getNumerator()+" is
		// "+frac2.getDenominator());
		return new Fraction(newN, newD);
	}

	Fraction subtract(Fraction frac2) {
		int newN = (Numerator * frac2.getDenominator()) - (frac2.getNumerator() * Denominator);
		int newD = Denominator * frac2.getDenominator();

		return new Fraction(newN, newD);
	}

	Fraction multiply(Fraction frac2) {
		int newN = Numerator * frac2.getNumerator();
		int newD = Denominator * frac2.getDenominator();

		return new Fraction(newN, newD);
	}

	Fraction divide(Fraction frac2) {
		int newN = Numerator * frac2.getDenominator();
		int newD = Denominator * frac2.getNumerator();

		return new Fraction(newN, newD);
	}

	private boolean check(int value, String side) {
		if (value == 0) {
			System.err.println("Error! Denominator must be bigger than 0.");
			return false;
		} else
			return true;
	}

	public String toString() {
		String str = Numerator + "/" + Denominator;
		return str;
	}

	public boolean isZero(Fraction frac2) {
		if (frac2.getDenominator() == 0) {
			System.err.println("Error! The Denominator of the second Fraction must be bigger than 0.");
			return false;
		}
		return true;
	}
	public boolean isEqualTo(Fraction frac2){
		int newN = Numerator * frac2.getDenominator();
		int newD = Denominator * frac2.getNumerator();
		
		int newNum = frac2.getNumerator() * Denominator;
		int newDen = frac2.getDenominator() * Numerator;
		
		if (newN == newNum && newD == newDen){
			return true;
		}else return false;
		
	}
}
