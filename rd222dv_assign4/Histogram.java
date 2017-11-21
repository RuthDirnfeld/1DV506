package rd222dv_assign4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Histogram {
	public static void main(String[] args) throws IOException {
		// Create an object representing a file
		File file = new File("D:\\lnu\\java_courses\\1DV506\\src\\rd222dv_assign4\\Histogram.txt");
		// Create a Scanner reading from the file
		Scanner fileScan = new Scanner(file); // Might generate IOException
		// Read words from the file , one by one
				
		ArrayList<Integer> list = new ArrayList<Integer>();
		int total=0;
		while (fileScan.hasNext()){
			total++;
		        list.add(fileScan.nextInt());
		}
		int [] counter = new int [10];
		for(int i=0; i<list.size();i++){
			if (list.get(i) >=1 && list.get(i)<=10){
				counter[0]++;
			}
			if (list.get(i) >10 && list.get(i)<=20){
				counter[1]++;
			}
			if (list.get(i) >20 && list.get(i)<=30){
				counter[2]++;
			}
			if (list.get(i) >30 && list.get(i)<=40){
				counter[3]++;
			}
			if (list.get(i) >40 && list.get(i)<=50){
				counter[4]++;
			}
			if (list.get(i) >50 && list.get(i)<=60){
				counter[5]++;
			}
			if (list.get(i) >60 && list.get(i)<=70){
				counter[6]++;
			}
			if (list.get(i) >70 && list.get(i)<=80){
				counter[7]++;
			}
			if (list.get(i) >80 && list.get(i)<=90){
				counter[8]++;
			}
			if (list.get(i) >90 && list.get(i)<=100){
				counter[9]++;
			}
		}
		fileScan.close();
	
		int valueTotal=0;
		for (int j=0; j<counter.length; j++){
			valueTotal += counter[j];
		}
		System.out.print("Reading integers from file: "+file);
		System.out.print("\nNumber of integers in the interval [1,100]: "+valueTotal);
		System.out.print("\nOthers: "+(total-valueTotal));
		System.out.print("\nHistogram\n");	
		System.out.print("1 - 10  | ");
		display(counter[0]);
		System.out.print("\n11 - 20 | ");
		display(counter[1]);
		System.out.print("\n21 - 30 | ");
		display(counter[2]);
		System.out.print("\n31 - 40 | ");
		display(counter[3]);
		System.out.print("\n41 - 50 | ");
		display(counter[4]);
		System.out.print("\n51 - 60 | ");
		display(counter[5]);
		System.out.print("\n61 - 70 | ");
		display(counter[6]);
		System.out.print("\n71 - 80 | ");
		display(counter[7]);
		System.out.print("\n81 - 90 | ");
		display(counter[8]);
		System.out.print("\n91 - 100| ");
		display(counter[9]);
		}
		public static void display(int n){
		for (int i=0; i<n; i++){
			System.out.print("*");
		}
		}
	}
