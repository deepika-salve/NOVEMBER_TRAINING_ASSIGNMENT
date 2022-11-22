package Q5;

public class D extends C{

	@Override
	void div(int a, int b) {
		System.out.println("Division of a and b is =" +( a / b));		
	}
	
	public static void main(String[] args) {
		
		D d= new D();
		d.sum(4, 5);
		d.sub(65, 5);
		d.mul(5, 5);
		d.div(45, 9);
	}
	

}
