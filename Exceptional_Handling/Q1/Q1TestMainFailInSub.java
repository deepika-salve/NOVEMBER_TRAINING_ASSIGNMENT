package Exceptional_Handling.Q1;

import java.util.ArrayList;
import java.util.List;

public class Q1TestMainFailInSub {

	public static void main(String[] args) throws ResultException {
		
		List<StudentResult> sublist= new ArrayList<>();
	
		StudentResult sub1 = new StudentResult("Maths", 50);
		StudentResult sub2 = new StudentResult("Science", 20);
		StudentResult sub3 = new StudentResult("English", 40);
		StudentResult sub4 = new StudentResult("Hindi", 60);
		sublist.add(sub1);
		sublist.add(sub2);
		sublist.add(sub3);
		sublist.add(sub4);
		Student s1 = new Student(1, "sameer", "dewas", sublist);
		
		System.out.println("student data"+s1);
		s1.checkFailInMoreThenTwoSubject(s1);
		
		StudentResult sub12 = new StudentResult("Maths", 50);
		StudentResult sub22 = new StudentResult("Science", -20);
		StudentResult sub32 = new StudentResult("English", 40);
		StudentResult sub42 = new StudentResult("Hindi", 60);
		sublist.add(sub12);
		sublist.add(sub22);
		sublist.add(sub32);
		sublist.add(sub42);
		Student s12 = new Student(1, "sameer", "dewas", sublist);
		
		System.out.println("student data"+s12);
		s1.checkIfMarksIsNegative(s12);
		
		
	}
}
