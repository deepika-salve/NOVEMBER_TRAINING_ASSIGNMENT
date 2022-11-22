package Q4;

import java.util.Scanner;

public class Area {
	
	public static double checkValidity(double a, double b, double c)
    {
        // check condition
        if (a + b <= c || a + c <= b || b + c <= a)
            return 0;
        else
            return 1;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the name shape that you want area of:");
		System.out.println("Press 1 for Rectangle");
		System.out.println("Press 2 for Square");
		System.out.println("Press 3 for Triangle");
		
		int shape= sc.nextInt();
		
		switch (shape){
		 case 1:
			 System.out.println("Enter width");
				int width = sc.nextInt();
				System.out.println("Enterheight");
				int height = sc.nextInt();
			 System.out.println("Area of Rectangle:" + (width*height));
			    break;	
			    
		 case 2:
			 System.out.println("Enter side ");
				int side = sc.nextInt();
				
			 System.out.println("Area of Square:" + (side*side));
			    break;	
			    
		 case 3:
			 System.out.println("Enter side1");
			 double  side1 = sc.nextDouble();
				System.out.println("Enter side2");
				double  side2 = sc.nextDouble();
				
				System.out.println("Enter side3");
				double  side3 = sc.nextDouble();
				
				double  Perimeter = side1 + side2 + side3;
				double  s = Perimeter/2; 
				double  Area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
			 System.out.println("Area of Rectangle:" + Area);
			 
			 
			 // check the given three sides are belong to right angle triangle or not. 
			 if ((checkValidity(side1, side2, side3)) == 1)
		            System.out.print("The three sides are belong to right angle triangle");
		        else
		            System.out.print("The three sides are not belong to right angle triangle");
		    
			    break;	
			 
		}
		
		
		
		
	}}


