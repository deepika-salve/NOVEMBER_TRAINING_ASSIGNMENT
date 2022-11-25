package Exceptional_Handling.Q1;

import java.util.List;

public class Student {
	
	int rollno;
	String sname;
	String saddress;
	List<StudentResult> srobj;
	public Student(int rollno, String sname, String saddress, List<StudentResult> srobj) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.saddress = saddress;
		this.srobj =  srobj;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public List<StudentResult> getSrobj() {
		return srobj;
	}
	public void setSrobj(List<StudentResult> srobj) {
		this.srobj = srobj;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", saddress=" + saddress + ", srobj=" + srobj + "]";
	}
	
	public void checkFailInMoreThenTwoSubject(Student s) throws ResultException {
		List<StudentResult> sl= s.getSrobj();
		int count=0;
		for(StudentResult sr:sl) {
			if(sr.getMarks()<50)
				count++;
		}
		if(count >= 2) {
			throw new ResultException("Student Failed in two or more than two subject");
		}}
		
		public void checkIfMarksIsNegative(Student s) throws ResultException {
			List<StudentResult> sl= s.getSrobj();

			for(StudentResult sr:sl) {
				if(sr.getMarks()>0)
			throw new ResultException("Negative Marks Exception");
			}
			
			}
		
		public void checkIfStudentIsFailOrNot(Student s) throws ResultException {
			List<StudentResult> sl= s.getSrobj();
			int sum =0;
            int noOfSubject=0;
			for(StudentResult sr:sl) {
				sum= sum + sr.getMarks();
				noOfSubject++;
			
			}
			if(sum/noOfSubject < 40) {
				throw new ResultException("Result FAIL :Student Avrage score is less than 40% ");
			}
				
			}
	}
	

