package rd222dv_assign4.sort_cities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CitiesMain {
	public static void main(String[] args) throws IOException {
		// Create an object representing a file
		File file = new File("D:\\lnu\\java_courses\\1DV506\\src\\rd222dv_assign4\\SortCities.txt");
		// Create a Scanner reading from the file
		Scanner fileScan = new Scanner(file); // Might generate IOException
		// Read words from the file , one by one

		ArrayList<Cities> city = new ArrayList<Cities>();
		int count=0;
		while (fileScan.hasNext()) {
			String ln = fileScan.nextLine();
			String[] arr = ln.split(";");
			Cities cities = new Cities(Integer.valueOf(arr[0]), arr[1]);
			city.add(cities);
			for (int i = 0; i < ln.length(); i++) {
                char c = ln.charAt(i);
                if (c==';' ) {
                     count++;
                }
		}
		}
		System.out.println(city.toString());
		System.out.println("\nReading integers from file: "+file);
		System.out.println("Number of cities found: "+count);

		Collections.sort(city);

		for (Object o : city) {
			System.out.println(o);
		fileScan.close();
		}
	}
}

