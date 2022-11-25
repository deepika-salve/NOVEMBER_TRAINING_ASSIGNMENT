package Exceptional_Handling;

import java.util.ArrayList;
import java.util.List;

public class Q1TestMainForStudentFailORNot {

	public static void main(String[] args) throws ResultException {
		
		List<StudentResult> sublist= new ArrayList<>();
		
		StudentResult sub12 = new StudentResult("Maths", 23);
		StudentResult sub22 = new StudentResult("Science", 1);
		StudentResult sub32 = new StudentResult("English", 23);
		StudentResult sub42 = new StudentResult("Hindi", 4);
		sublist.add(sub12);
		sublist.add(sub22);
		sublist.add(sub32);
		sublist.add(sub42);
		Student s12 = new Student(1, "surbhi", "dewas", sublist);
		
		System.out.println("student data"+s12);
		s12.checkIfStudentIsFailOrNot(s12);
		
		
	}
}
