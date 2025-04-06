package org.example;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestCaculator {
	@Test
    public void testSum() {
        Caculator caculator = new Caculator();
        assertEquals(caculator.sum(2, 3), 5);
    }

    @Test
    public void testSub() {
        Caculator calculator = new Caculator();
        assertEquals(calculator.sub(2, 2), 0);
    }
}
