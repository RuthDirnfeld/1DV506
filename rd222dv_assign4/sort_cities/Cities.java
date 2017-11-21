package rd222dv_assign4.sort_cities;

public class Cities implements Comparable<Cities> {

	// fields
	private int zipnr = 0;
	private String city = "";

	// constructor
	public Cities(int z, String c) {
		city = c;
		zipnr = z;
	}

	// method names
	public int postnr() {
		return zipnr;
	}

	public String ort() {
		return city;
	}

	@Override
	public int compareTo(Cities c) {
		return c.zipnr - zipnr;
	}

	public String toString() {
		return zipnr + " " + city;
	}
}
