package collection;

import java.util.Collections;
import java.util.Vector;

public class Q5SortVector {

	public static void main(String[] args) {
		// Create a instance vector
		Vector<String> vec = new Vector<String>();

		// Insert the values in vector
		vec.add("a");
		vec.add("d");
		vec.add("e");
		vec.add("b");
		vec.add("c");

		// Display the vector
		System.out.println("original vector : " + vec);

		// Call sort() method
		Collections.sort(vec);

		// Display vector after replacing value
		System.out.println("\nsorted vector : " + vec);
	}
}
