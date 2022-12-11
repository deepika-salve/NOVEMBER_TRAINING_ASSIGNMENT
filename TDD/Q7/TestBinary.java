package TDD.Q7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestBinary {
	@Test
	public void consecutiveNumbersAdditionTest() {
		BinaryEqui c = new BinaryEqui();
		assertEquals("110111", c.getBinary());
	}
}
