package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Q3RemoveDuplicate {
	public static void main(String[] args) {
		
		 List<Integer> newList = new ArrayList<Integer>();
		 int n;  
		 Scanner sc=new Scanner(System.in);  
		 System.out.print("Enter the number of elements you want to store: ");  
		//reading the number of elements from the that we want to enter  
		n=sc.nextInt();  
		
		for(int i=0;i<n;i++) {
			newList.add(sc.nextInt());
			
		}
		
		 Set<Integer> set = new LinkedHashSet<>();
		 
		 set.addAll(newList);
		 newList.clear();
		 newList.addAll(set);
		 Collections.sort(newList);
		 System.out.println("ArrayList with duplicates removed: " + newList );
	}

}
