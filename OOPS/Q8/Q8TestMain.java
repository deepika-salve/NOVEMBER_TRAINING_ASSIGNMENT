package Q8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q8TestMain {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		Mobile mobile = new Mobile(1, "semiconductor1", formatter.parse("01/08/2022"));
		LCD lcd = new LCD(2, "semiconductor2", formatter.parse("22/05/2020"));
		Laptop laptop = new Laptop(3, "semiconductor3", formatter.parse("13/08/2021"));
		
		
		mobile.display();
		lcd.display();
		laptop.display();
	}

	
	
}
