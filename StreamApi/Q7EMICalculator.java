package StreamApi;

import java.util.Scanner;

public class Q7EMICalculator {
	public static void main(String []args)
    {
        Scanner a = new Scanner(System.in);
         
        double principal, rate, time, emi;
  
        System.out.print("Enter principal: ");
        principal = a.nextFloat();
      
        System.out.print("Enter rate: ");
        rate = a.nextFloat();
      
        System.out.print("Enter time in Months: ");
        time = a.nextFloat();
        rate=rate/(12*100);
      
        emi= emiCalculation(principal,rate,time);
      
        System.out.print("Monthly EMI is= "+emi+"\n");
                 
    }
    static double emiCalculation(double p,double r,double t)
    {
      double e= (p*r*Math.pow(1+r,t))/(Math.pow(1+r,t)-1);
      return e;
    }

}
