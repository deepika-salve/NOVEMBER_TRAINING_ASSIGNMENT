package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2BinarySearch {
	
	static void binarySearch(int array[], int element) {

		int lo = 0, hi = array.length - 1;
	    // This below check covers all cases , so need to check
	    // for mid=lo-(hi-lo)/2
	    while (hi - lo > 1) {
	        int mid = (hi + lo) / 2;
	        if (array[mid] < element) {
	            lo = mid + 1;
	        }
	        else {
	            hi = mid;
	        }
	    }
	    if (array[lo] == element) {
	      System.out.println("Found At Index " + lo );
	    }
	    else if (array[hi] == element) {
	        System.out.println("Found At Index " + hi );
	    }
	    else {
	        System.out.println("Not Found" );
	    }}
	
	public static void main(String[] args)
    {
 
        // Creating arrayList list dynamically
        List<Integer> list = new ArrayList<Integer>();
        // List is created
 
        // Adding elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(99);
        list.add(100);
        
        int[] arr= new int[list.size()];
       int i =0;
       for(Integer n:list) {
    	   arr[i]=n;
    	   i++;}
    	   
      

       // get input from user for element to be searched
       Scanner input = new Scanner(System.in);

       System.out.println("Enter element to be searched:");

       int element = input.nextInt();
     

     
	 Q2BinarySearch.binarySearch(arr, element);
    }

}
