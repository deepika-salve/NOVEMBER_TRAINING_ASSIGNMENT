package Q1;

import java.util.Date;

public class Employee extends Person{
	
	public Date date_of_joining;
	public String base_location;
	public Department deptobj;
	public String contactno;
	public String emailid;
	public Employee() {
		super(1, "deepika", "indore", new Date(2022-11-22));
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(Date date_of_joining, String base_location, Department deptobj, String contactno, String emailid) {
		super(1, "deepika", "indore", new Date(2022-11-22));
		this.date_of_joining = date_of_joining;
		this.base_location = base_location;
		this.deptobj = deptobj;
		this.contactno = contactno;
		this.emailid = emailid;
	}


	public Date getDate_of_joining() {
		return date_of_joining;
	}
	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}
	public String getBase_location() {
		return base_location;
	}
	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}
	public Department getDeptobj() {
		return deptobj;
	}
	public void setDeptobj(Department deptobj) {
		this.deptobj = deptobj;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	@Override
	public String toString() {
		return "Employee [date_of_joining=" + date_of_joining + ", base_location=" + base_location + ", deptobj="
				+ deptobj + ", contactno=" + contactno + ", emailid=" + emailid + "]";
	}
	
	

}
