package TDD.Q3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestOddEven {
OddEvenCount oddEvenCount=new OddEvenCount();
	
	@Test
	public void evenNumberTest() {
		assertEquals(3, oddEvenCount.evenCount(23456));
	}
	@Test
	public void oddNumberTest() {
		assertEquals(2, oddEvenCount.oddCount(23456));
	}
}
