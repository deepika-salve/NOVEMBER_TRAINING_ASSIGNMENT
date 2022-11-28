package collection.Q7;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {

	int rollno;
	String sname;
	String classname;
	String totalmarks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String sname, String classname, String totalmarks) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.classname = classname;
		this.totalmarks = totalmarks;
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

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(String totalmarks) {
		this.totalmarks = totalmarks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", classname=" + classname + ", totalmarks="
				+ totalmarks + "]";
	}

	public void PrintStudentGotFirstSecondThirdPosition(List<Student> student) {

		Comparator<Student> compareByMarks = (Student o1, Student o2) -> o1.getTotalmarks()
				.compareTo(o2.getTotalmarks());

		Collections.sort(student, compareByMarks.reversed());

		System.out.println("Student Name who score first is:" + student.get(0).getSname());
		System.out.println("Student Name who score second is:" + student.get(1).getSname());
		System.out.println("Student Name who score third is:" + student.get(2).getSname());

	}

	public void PrintStudentScoreLessThan50(List<Student> studentlist) {

		for (Student sl : studentlist) {
			if ((Float.parseFloat(sl.getTotalmarks()) / 500) * 100 < 50) {
				System.out.println("\nStudent Name who score less than 50%:" + sl.getSname());
			}
		}

	}

	public void PrintStudentScoreLessThan35(List<Student> studentlist) {

		for (Student sl : studentlist) {
			if ((Float.parseFloat(sl.getTotalmarks()) / 500) * 100 < 35) {
				System.out.println("\nStudent Name who score less than 35% and Failed:" + sl.getSname());
			}
		}

	}

	public void PrintStudentScoreAverage(List<Student> studentlist) {
		int sum = 0;
		for (Student sl : studentlist) {

			sum = (int) (sum + (Float.parseFloat(sl.getTotalmarks())));
		}

		int avr = sum / studentlist.size();
		System.out.println("\naverage score" + avr);
		for (Student sl : studentlist) {
			if ((int) ((Float.parseFloat(sl.getTotalmarks()))) > avr) {
				System.out.println("\nStudent Name who score less than average marks:" + sl.getSname());
			}
		}

	}

	public void PrintAllStudent(List<Student> studentlist) {
		for (Student sl : studentlist) {

			System.out.println("\nDetail of all students on the basis of Name:" + sl);
		}

	}

}
