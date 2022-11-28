package collection.Q7;

import java.util.ArrayList;
import java.util.List;

public class Q7TestMain {
	
	public static void main(String[] args) {
		
		Student s= new Student();
		
		List<Student> slist= new ArrayList<>();
		slist.add(new Student(1,"Aman","4 th","389"));
		slist.add(new Student(2,"deepika","4 th","478"));
		slist.add(new Student(3,"mayank","4 th","298"));
		slist.add(new Student(4,"sameer","4 th","300"));
		slist.add(new Student(5,"pooja","4 th","159"));
		
		s.PrintStudentGotFirstSecondThirdPosition(slist);
		s.PrintStudentScoreLessThan50(slist);
		s.PrintStudentScoreAverage(slist);
		s.PrintAllStudent(slist);
	}

}
