package Q8;

import java.util.Date;

public class Electornics {
	
	public Integer id;
	public String semiconductorType;
	public Date dateOfManufacturing;
	
	public Electornics(Integer id, String semiconductorType, Date dateOfManufacturing) {
		this.id = id;
		this.semiconductorType = semiconductorType;
		this.dateOfManufacturing = dateOfManufacturing;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSemiconductorType() {
		return semiconductorType;
	}

	public void setSemiconductorType(String semiconductorType) {
		this.semiconductorType = semiconductorType;
	}

	public Date getDateOfManufacturing() {
		return dateOfManufacturing;
	}

	public void setDateOfManufacturing(Date dateOfManufacturing) {
		this.dateOfManufacturing = dateOfManufacturing;
	}

	@Override
	public String toString() {
		return "Electornics [id=" + id + ", semiconductorType=" + semiconductorType + ", dateOfManufacturing="
				+ dateOfManufacturing + "]";
	}
	
	
	
	
	
	
}
