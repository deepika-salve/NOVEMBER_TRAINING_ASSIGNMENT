package Exceptional_Handling.Q7;

public class Q7TestMain {
	
	 public static void main(String[] args)
	    {
	        try
	        {
	            // Creating an exception
	            NumberFormatException ex =
	                       new NumberFormatException("Exception");
	  
	            // Setting a cause of the exception
	            ex.initCause(new NullPointerException(
	                      "This is actual cause of the exception"));
	  
	            throw ex;
	        }
	  
	        catch(NumberFormatException ex)
	        {
	            // displaying the exception
	            System.out.println(ex);
	  
	            // Getting the actual cause of the exception
	            System.out.println(ex.getCause());
	        }
	    }

}
