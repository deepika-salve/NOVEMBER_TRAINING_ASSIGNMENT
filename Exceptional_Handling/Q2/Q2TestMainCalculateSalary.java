package Exceptional_Handling.Q2;

public class Q2TestMainCalculateSalary {
	public static void main(String[] args) throws LeaveExceedLimitException {
		
		
		char arrofattandance[] ={'P','P','A','P','A','P','L','P','P','P','P','P','L','P','P','P','P','P','P','P','P','P','P','P','P','P','P','P','P','P'};
		Employee e= new Employee(1, "deep",20000,arrofattandance);
		e.calculateSalary();
		
		
		
	}

}
