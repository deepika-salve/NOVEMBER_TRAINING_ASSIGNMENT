package Array;

public class Q10SortArrayOfStringByLength {

	public static void main(String[] args) {
		//define original array     
		String arr[] = {"GeeksforGeeks", "I", "from", "am"};   
        String temp = null;    
 
        //print original array    
       System.out.println("Original array: ");    
       for (int i = 0; i <arr.length; i++) {     
           System.out.print(arr[i] + " ");    
        }    
         
        for (int i = 0; i <arr.length; i++) {     
          for (int j = i+1; j <arr.length; j++) {     
              if(arr[i].length() >arr[j].length()) {      
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
