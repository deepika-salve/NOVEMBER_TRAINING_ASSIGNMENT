package TDD.Q2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestFactorial {
	@Test
	public void consecutiveNumbersAdditionTest() {
		FactorialTest c = new FactorialTest();
		assertEquals(120, c.getFactorial());
	}
}
