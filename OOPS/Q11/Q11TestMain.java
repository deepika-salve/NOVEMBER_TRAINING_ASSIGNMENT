package Q11;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Q11TestMain {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		Employee e1 = new Employee(1, "Deepika Salve", "xyz", "dewas",formatter.parse("01/08/1994") , formatter.parse("10/10/2021"));
		
		System.out.println("Employee Details : "+ e1);
	}

}
