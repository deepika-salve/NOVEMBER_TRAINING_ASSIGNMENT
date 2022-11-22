package Q11;

import java.util.Date;

public class Employee {
	public Integer empid;
	public String empname;
	public String empsalary;
	public String empaddress;
	public Date emp_dob;
	public Date date_of_joining;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empid, String empname, String empsalary, String empaddress, Date emp_dob,
			Date date_of_joining) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empaddress = empaddress;
		this.emp_dob = emp_dob;
		this.date_of_joining = date_of_joining;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(String empsalary) {
		this.empsalary = empsalary;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public Date getEmp_dob() {
		return emp_dob;
	}
	public void setEmp_dob(Date emp_dob) {
		this.emp_dob = emp_dob;
	}
	public Date getDate_of_joining() {
		return date_of_joining;
	}
	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empaddress="
				+ empaddress + ", emp_dob=" + emp_dob + ", date_of_joining=" + date_of_joining + "]";
	}
	
	

}
