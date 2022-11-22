package Q8;

import java.util.Date;

public class LCD extends Electornics {

	public LCD(Integer id, String semiconductorType, Date dateOfManufacturing) {
		super(id, semiconductorType, dateOfManufacturing);

	}

	public void display() {

		System.out.println("Details of LCD class id:" + this.id);
		System.out.println("semiconductorType:" + this.semiconductorType);
		System.out.println("dateOfManufacturing:" + this.dateOfManufacturing);
	}
}
