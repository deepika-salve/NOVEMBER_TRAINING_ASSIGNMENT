package Q1;

import java.util.Date;

public class TestMain {
	 public static void main(String[] args) {
		
		Department d= new Department(1, "Backend");
		Employee e= new Employee(new Date(), "Indore",  d, "79797979", "deepika.salve@yash.com");
		Customer c= new Customer(new Date(), "add","79797979", "deepika.salve@yash.com");
		System.out.println("Employee Details are:"+ e);
		System.out.println("Customer Details are:"+ c);

	}

}
