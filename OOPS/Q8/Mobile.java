package Q8;

import java.util.Date;

public class Mobile extends Electornics {

	public Mobile(Integer id, String semiconductorType, Date dateOfManufacturing) {
		super(id, semiconductorType, dateOfManufacturing);

	}

	public void display() {

		System.out.println("Details of Mobile class id:" + this.id);
		System.out.println("semiconductorType:" + this.semiconductorType);
		System.out.println("dateOfManufacturing:" + this.dateOfManufacturing);
	}

}
