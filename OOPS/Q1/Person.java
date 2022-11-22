package Q1;

import java.util.Date;

public class Person {
	
	private int Pid;
	private String pname;
	private String paddress;
	private Date dob;
	
	
	public Person(int pid, String pname, String paddress, Date dob) {
		super();
		Pid = pid;
		this.pname = pname;
		this.paddress = paddress;
		this.dob = dob;
	}
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	

}
