package Q10;

public class Q10TestMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Product p = new Product(1, "Product1","2000", "unitOfMeasurement");
		Product copy = p.clone();
		 
        copy.setPname("Product2");
        copy.setPrice("3000");

        System.out.println("original= " + p);
        System.out.println("copy= " + copy);
        
        
        //check newly clone object is belong to Product class
        System.out.println(copy instanceof Product);
	}

}
