package Exceptional_Handling.Q1;

public class StudentResult {
	 String subject;
	 int marks;
	public StudentResult(String subject, int marks) {
		super();
		this.subject = subject;
		this.marks = marks;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentResult [subject=" + subject + ", marks=" + marks + "]";
	}
	 
	 

}
