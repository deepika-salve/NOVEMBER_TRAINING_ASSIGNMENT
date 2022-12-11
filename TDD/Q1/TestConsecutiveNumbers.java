package TDD.Q1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestConsecutiveNumbers {
	@Test
	public void consecutiveNumbersAdditionTest() {
		ConsecutiveNumbers c = new ConsecutiveNumbers(); 
		assertEquals(15, c.add());
	}
}
