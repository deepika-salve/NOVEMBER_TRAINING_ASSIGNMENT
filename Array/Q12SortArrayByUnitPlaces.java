package Array;

public class Q12SortArrayByUnitPlaces {
	
	public static int findremender(int n) {
		
		
		
		return n%10;
		
	}

	public static void main(String[] args) {
		//define original array     
		int arr[] = { 10,2,3,41,12,13,19,81,9 };
		int n = arr.length;  
        int temp = 0;    
 
        //print original array    
       System.out.println("Original array: ");    
       for (int i = 0; i <arr.length; i++) {     
           System.out.print(arr[i] + " ");    
        }    
         
        for (int i = 0; i <arr.length; i++) {     
          for (int j = i+1; j <arr.length; j++) {
        	  
        	  
              if(findremender(arr[i]) >findremender(arr[j])) {      
                 temp = arr[i];    
                 arr[i] = arr[j];    
                 arr[j] = temp;    
               }     
            }     
        }    
        //print sorted array    
        System.out.println("\nArray sorted in ascending order: ");    
        for (int i = 0; i <arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
	}

}
