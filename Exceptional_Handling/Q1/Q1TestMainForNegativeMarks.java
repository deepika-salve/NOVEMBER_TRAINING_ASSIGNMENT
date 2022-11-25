package Exceptional_Handling.Q1;

import java.util.ArrayList;
import java.util.List;

public class Q1TestMainForNegativeMarks {

	public static void main(String[] args) throws ResultException {
		
		List<StudentResult> sublist= new ArrayList<>();
		
		StudentResult sub12 = new StudentResult("Maths", 50);
		StudentResult sub22 = new StudentResult("Science", -20);
		StudentResult sub32 = new StudentResult("English", 40);
		StudentResult sub42 = new StudentResult("Hindi", 60);
		sublist.add(sub12);
		sublist.add(sub22);
		sublist.add(sub32);
		sublist.add(sub42);
		Student s12 = new Student(1, "aman", "dewas", sublist);
		
		System.out.println("student data"+s12);
		s12.checkIfMarksIsNegative(s12);
		
		
	}
}
