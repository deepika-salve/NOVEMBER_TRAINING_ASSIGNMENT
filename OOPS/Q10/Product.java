package Q10;

public class Product implements Cloneable {
	public Integer pid;
	public String pname;
	public String price;
	public String unitOfMeasurement;

	
	public Product(Integer pid, String pname, String price, String unitOfMeasurement) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.unitOfMeasurement = unitOfMeasurement;
	}

	public Product clone() throws CloneNotSupportedException {

		Product obj = (Product) super.clone();

		return obj;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getUnitOfMeasurement() {
		return unitOfMeasurement;
	}

	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}

	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", unitOfMeasurement="
				+ unitOfMeasurement + "]";
	}

	
	
	

}
