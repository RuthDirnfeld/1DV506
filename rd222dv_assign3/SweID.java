package rd222dv_assign3;

public class SweID {

	public static void main(String[] args) {

		System.out.println("640123 - 8826");
		System.out.println("A female Number: " + isFemaleNumber("640123-3326"));
		System.out.println("A male Number: " + isMaleNumber("550414-0913"));
		System.out.println("Are equal: " + areEqual("640123-8826", "550414-0913"));
		System.out.println("Is correct: " + isCorrect("551314-0913"));

	}

	public static String getFirstPart(String num) {
		String firstPart = num.substring(0, 6);
		return firstPart;
	}

	public static String getSecondPart(String num) {
		String secondPart = num.substring(7, 11);
		return secondPart;
	}

	public static boolean isFemaleNumber(String num) {
		String position = Character.toString(num.charAt(9));
		int result = Integer.parseInt(position);
		if ((result % 2) == 0) {
			return true;
		} else
			return false;
	}

	public static boolean isMaleNumber(String num) {
		String position = Character.toString(num.charAt(9));
		int result = Integer.parseInt(position);
		if ((result % 2) == 1) {
			return true;
		} else
			return false;
	}

	public static boolean areEqual(String num, String num2) {
		if (num == num2) {
			return true;
		} else
			return false;
	}

	public static boolean isCorrect(String num) {
		
		String year = num.substring(0, 2);
		int Year = Integer.parseInt(year);
		// System.out.println("Year is "+Year);
		String month = num.substring(2, 4);
		int Month = Integer.parseInt(month);
		// System.out.println("Month is "+Month);
		String day = num.substring(4, 6);
		int Day = Integer.parseInt(day);
		// System.out.println("Day is "+Day);

		String one = num.substring(0, 1); //creating integers
		int One = Integer.parseInt(one);
		String two = num.substring(1, 2);
		int Two = Integer.parseInt(two);
		String three = num.substring(2, 3);
		int Three = Integer.parseInt(three);
		String four = num.substring(3, 4);
		int Four = Integer.parseInt(four);
		String five = num.substring(4, 5);
		int Five = Integer.parseInt(five);
		String six = num.substring(5, 6);
		int Six = Integer.parseInt(six);
		String seven = num.substring(7, 8); // leave out char 6 "-"
		int Seven = Integer.parseInt(seven);
		String eight = num.substring(8, 9);
		int Eight = Integer.parseInt(eight);
		String nine = num.substring(9, 10);
		int Nine = Integer.parseInt(nine);
		//System.out.println("Nine " + Nine);
		String ten = num.substring(10, 11);
		int Ten = Integer.parseInt(ten);
		//System.out.println("Ten: "+Ten);

		int result1=One*2;
		int sum1=result1/10+result1%10;
		
		int result2=Three*2;
		int sum2=result2/10+result2%10;
		
		int result3=Five*2;
		int sum3=result3/10+result3%10;
		
		int result4=Seven*2;
		int sum4=result4/10+result4%10;
		
		int result5=Nine*2;
		int sum5=result5/10+result5%10;
		
		int sum = (sum1+sum2+sum3+sum4+sum5+Two+Four+Six+Eight)%10;
		int result = 10-sum;

		if (Year >= 0 && Year < 100 && Month >= 0 && Month <= 12 && Day >= 0 && Day <= 31 && result == Ten) {
			return true;
		} else return false;

	}
}
