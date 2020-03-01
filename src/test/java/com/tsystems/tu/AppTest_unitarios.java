package com.tsystems.tu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Unit test for simple App.
 */
public class AppTest_unitarios {

	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	@Test
	public void positiveMultiplyTest() {
		App calculator = new App();
		assertEquals("50*3 = 150", 150, calculator.multiply(3, 50));
	}

    @Test
    public void failTest() {
    	App calculator = new App();
        assertEquals("50*3 is not 155", 155, calculator.multiply(3, 50));
    }

}
