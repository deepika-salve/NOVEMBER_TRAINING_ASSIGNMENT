package Q1;

public class Department {
	
	public Integer  deptid;
	public String dname;
	
	
	public Department(Integer deptid, String dname) {
		super();
		this.deptid = deptid;
		this.dname = dname;
	}
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", dname=" + dname + "]";
	}
	
	

}
