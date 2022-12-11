package TDD.Q6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestInteger {
	@Test
	public void consecutiveNumbersAdditionTest() {
		IntegerlTest c = new IntegerlTest();
		assertEquals(2107, c.getAns());
	}
}
