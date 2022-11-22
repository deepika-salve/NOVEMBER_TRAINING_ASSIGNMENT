package Q2;

public class Triangle implements Shape{

	@Override
	public void area() {
		 float b=4,h =13,area ;  
         area = ( b*h) / 2 ;  
         System.out.println("Area of Triangle is: "+area);  
	}

}
