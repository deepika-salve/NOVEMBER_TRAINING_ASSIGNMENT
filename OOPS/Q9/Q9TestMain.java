package Q9;

public class Q9TestMain {
	
	String name;
	
	
	public Q9TestMain(String name) {
		super();
		this.name = name;
		count++;  
	}

	private static int count;  
	
	public Q9TestMain()   
	{  
	// increase the count variable by 1  
	
	}  

	public static void main(String[] args) {
		//Object 1 create
		Q9TestMain obj = new Q9TestMain("a");

		//Object 2 create
		Q9TestMain obj2 = new Q9TestMain("b");

		
		//Assign obj 1 as null for collecting by gc
		obj = null;
		
		// calling garbage collector
		System.gc();
		
		System.out.println("end of garbage collection");

	}

	@Override
	protected void finalize() {
	
		System.out.println("finalize method called");
		System.out.print("Total Number of Objects: " + Q9TestMain.count); 
		  System.out.println("successfully garbage collected");
	}

}
