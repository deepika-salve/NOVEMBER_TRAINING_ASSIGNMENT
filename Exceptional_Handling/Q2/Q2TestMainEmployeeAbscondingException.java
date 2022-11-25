package Exceptional_Handling.Q2;

public class Q2TestMainEmployeeAbscondingException {
	public static void main(String[] args) throws EmployeeAbscondingException {
		
		
		char arrofattandance[] ={'P','P','A','P','A','P','P','P','P','L','P','P','L','P','N','N','N','N','P','P','P','P','P','P','P','P','P','P','P','P'};
		Employee e= new Employee(1, "deep",20000,arrofattandance);
		e.checkEmployeeAbsconding();
		
		
		
	}

}
