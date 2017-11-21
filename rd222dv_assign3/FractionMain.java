package rd222dv_assign3;

public class FractionMain {

	public static void main(String[] args) {
		Fraction frac1 = new Fraction(1, 2);
		Fraction frac2 = new Fraction(5, 3);

		System.out.println("First Fraction: " +frac1.toString());
		System.out.println("Is Negative: " +frac1.isNegative(-2, 2));

		System.out.println("Second Fraction: " + frac2.toString());

		if (frac1.isZero(frac2)) {
			System.out.println(frac1+" + "+frac2+" = "+frac1.add(frac2));
			System.out.println(frac1+" - "+frac2+" = "+frac1.subtract(frac2));
			System.out.println(frac1+" * "+frac2+" = "+frac1.multiply(frac2));
			System.out.println(frac1+" / "+frac2+" = "+frac1.divide(frac2));
		}
		System.out.println("Are equal: "+frac1.isEqualTo(frac2));
	}
}
