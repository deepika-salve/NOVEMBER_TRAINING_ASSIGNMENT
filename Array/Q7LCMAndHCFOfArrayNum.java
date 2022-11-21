package Array;

public class Q7LCMAndHCFOfArrayNum {
	
	// Function to return gcd of a and b
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
 
    // Function to find gcd of array of
    // numbers
    static int findHCF(int arr[], int n)
    {
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);
 
            if(result == 1)
            {
               return 1;
            }
        }
 
        return result;
    }

    static int findLCM(int myArray[], int n) {
    	int min, max, x, lcm = 0;
	     
	      for(int i = 0; i<myArray.length; i++) {
	         for(int j = i+1; j<myArray.length-1; j++) {
	            if(myArray[i] > myArray[j]) {
	               min = myArray[j];
	               max = myArray[i];
	            } else {
	               min = myArray[i];
	               max = myArray[j];
	            }
	            for(int k =0; k<myArray.length; k++) {
	               x = k * max;
	               if(x % min == 0) {
	                  lcm = x ;
	               }
	            }
	         }
	      }
    	
		return lcm;
    	
    	
    }
	public static void main(String[] args) {
		  int[] myArray = {25, 50, 125, 625};
		  int n = myArray.length;
	      System.out.println("LCM of the given array of numbers : " + findLCM(myArray,n));
	      System.out.println("HCF of the given array of numbers : " + findHCF(myArray,n));
	}

}
