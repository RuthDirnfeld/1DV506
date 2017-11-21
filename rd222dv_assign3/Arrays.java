package rd222dv_assign3;

public class Arrays {

	public static void main(String[] args) {
		int[] n = { 3, 4, 5, 6, 7 };
		int summ = sum(n);
		System.out.println(summ);

		System.out.println("n = " + toString(n));

		int[] adder = addN(n, 14);
		System.out.println(toString(adder));

		int[] reverser = reverse(n);
		System.out.println(toString(reverser));

		System.out.println(hasN(n, 3));

		replaceAll(n, 4, 9);
		System.out.println(toString(n));

		int[] sorter = sort(n);
		System.out.println(toString(sorter));
		
		int[] sub = {3,4,5};
		System.out.println(hasSubsequence(n, sub));
	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static String toString(int[] arr) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			builder.append(arr[i] + " ");
		}
		return builder.toString();
	}

	public static int[] addN(int[] arr, int n) {
		int[] m = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			m[i] = arr[i] + n;
		}
		return m;
	}

	public static int[] reverse(int[] arr) {
		int[] newArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[arr.length - 1 - i];
		}
		return newArray;
	}

	public static boolean hasN(int[] arr, int n) {
		for (int x : arr) {
			if (n == x) {
				return true;
			}
		}
		return false;
	}

	public static void replaceAll(int[] arr, int old, int nw) { // updated my
																// Array

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == old) {
				arr[i] = nw;
			}
		}
	}

	public static int[] sort(int[] arr) {
		int[] newArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (newArray[i] < newArray[j]) {
					int buf = newArray[i];
					newArray[i] = newArray[j];
					newArray[j] = buf;
				}
			}

		}
		return newArray;
	}

	public static boolean hasSubsequence(int[] arr, int[] sub) {
		int j = 0;
		for (int i = 0; i < arr.length ; i++) {
			if (arr[i] == sub[j]) {
				//System.out.println(arr[i] + "-" + sub[j]);
				
				j++;
				if (j >= sub.length-1)
					return true;
			}
			else
			 j = 0;
		}
		return false;
	}
}
