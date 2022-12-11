package TDD.Q2;

public class FactorialTest {
	public static int getFactorial() {
		int fact =1;
		int number=5;
		for (int i = 1; i <= number; i++) {
			fact=fact*i;
		}
		return fact;
	}
}
