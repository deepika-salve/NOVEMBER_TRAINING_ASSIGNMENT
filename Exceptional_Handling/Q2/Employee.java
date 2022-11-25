package Exceptional_Handling.Q2;

import java.util.Arrays;

public class Employee {

	int empId;
	String ename;
	int salaryPerMonth;
	char[] attandance;

	public Employee() {

	}

	public Employee(int empId, String ename, int salaryPerMonth, char[] attandance) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salaryPerMonth = salaryPerMonth;
		this.attandance = attandance;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalaryPerMonth() {
		return salaryPerMonth;
	}

	public void setSalaryPerMonth(int salaryPerMonth) {
		this.salaryPerMonth = salaryPerMonth;
	}

	public char[] getAttandance() {
		return attandance;
	}

	public void setAttandance(char[] attandance) {
		this.attandance = attandance;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", salaryPerMonth=" + salaryPerMonth + ", attandance="
				+ Arrays.toString(attandance) + "]";
	}

	public void checkAttandanceOfEmployee() throws LeaveExceedLimitException {

		int countofleave = 0;

		for (char c : this.attandance) {
			if (c == 'L')
				countofleave++;

		}
		if (countofleave >= 2)
			throw new LeaveExceedLimitException("LeaveExceedLimitException");

	}

	public void checkEmployeeAbsconding() throws EmployeeAbscondingException {

		int countofleave = 0;
		boolean result = false;

		for (char c : this.attandance) {
			if (c == 'N')
				countofleave++;
			else
				countofleave=0;
			if(countofleave>=4)
				result = true;

		}
		if (result)
			throw new EmployeeAbscondingException("EmployeeAbscondingException");

	}
	
	public void calculateSalary() {
       
		int perDaySalary= this.salaryPerMonth/30;
	
		int countNoOfDayPresnt=0;
		
		for(char c: this.attandance) {
			if(c=='P')
				countNoOfDayPresnt++;
		}
		
		System.out.println("Calculated Salary for a month is: "+perDaySalary*countNoOfDayPresnt);

	}

}
