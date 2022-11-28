package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Q1SortCollectionInAsc {
	public static void main(String[] args)
    {
        // Create a list of strings
        ArrayList<String> al = new ArrayList<String>();
        al.add("Good");
        al.add("Are");
        al.add("Friends");
        al.add("Best");
        al.add("Gift");
 
        // Collections.sort method is sorting the elements of ArrayList in ascending order. 
        Collections.sort(al);
 
        // print the sorted list
        System.out.println("List after the use of" +
                           " Collection.sort() :\n" + al);
    }

}
