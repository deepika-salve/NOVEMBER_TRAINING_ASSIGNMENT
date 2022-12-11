package TDD.Q6;

public class IntegerlTest {
	
	public static int getAns() {
		int i, sum=0;
		  
		   for(i=101;i<200;i++)
		   {
		     if(i%7==0)
		     {
		      
		       sum+=i;
		     }
		   }
		 
		   return sum;
	}
}
