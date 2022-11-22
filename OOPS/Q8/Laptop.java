package Q8;

import java.util.Date;

public class Laptop extends Electornics {

	public Laptop(Integer id, String semiconductorType, Date dateOfManufacturing) {
		super(id, semiconductorType, dateOfManufacturing);

	}

	public void display() {

		System.out.println("Details of Laptop class id:" + this.id);
		System.out.println("semiconductorType:" + this.semiconductorType);
		System.out.println("dateOfManufacturing:" + this.dateOfManufacturing);
	}
}
