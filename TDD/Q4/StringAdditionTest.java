package TDD.Q4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringAdditionTest {
StringAddition stringAddition=new StringAddition();
	
	@Test
	public void stringAdditionTest() {
		assertEquals("9", stringAddition.additionString("2+3+4"));
		
	}
}
