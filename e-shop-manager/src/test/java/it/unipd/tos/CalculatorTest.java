package it.unipd.tos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void evaluatesExpression() {
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		assertEquals(6, sum);
	}

    @Test(expected = java.lang.NumberFormatException.class)
    public void evaluatesExpressionWithLetters() {
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("A+1");

        fail();
	}
}
