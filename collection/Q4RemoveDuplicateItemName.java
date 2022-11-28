package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q4RemoveDuplicateItemName {
	
	 public static <String> ArrayList<String> removeDuplicates(ArrayList<String> list)
	    {
	  
	        // Create a new ArrayList
	        ArrayList<String> newList = new ArrayList<String>();
	  
	        // Traverse through the first list
	        for (String element : list) {
	  
	            // If this element is not present in newList
	            // then add it
	            if (!newList.contains(element)) {
	  
	                newList.add(element);
	                
	            }
	        }
	  
	        // return the new list
	        return newList;
	    }
	
	public static void main(String[] args) {
		// Get the ArrayList with duplicate values
        ArrayList<String>
            list = new ArrayList<>(
                Arrays
                    .asList("fan", "desk", "phone", "kite", "sugar"));
  
        // Print the Arraylist
        System.out.println("ArrayList with duplicates: "
                           + list);
  
        // Remove duplicates
        ArrayList<String>
            newList = removeDuplicates(list);
        Collections.sort(newList, Collections.reverseOrder());
  
        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: "
                           + newList);
    
	}

}
