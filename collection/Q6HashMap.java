package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q6HashMap {
	
	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<String,String>();//Creating HashMap    
		   map.put("Mumbai","12,442,373");  //Put elements in Map  
		   map.put("Delhi ","11,034,555");  
		   map.put("Pune  ","3,124,458"); 
		   map.put("Ahmadabad  ","5,577,940"); 
		   
		   
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		   System.out.println("\nshow hashmap after the sort"); 
		   Map<String, String> treeMap = new TreeMap<String, String>(map);
		 //show hashmap after the sort
		  for(Map.Entry m : treeMap.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }  
		   
	}

}
