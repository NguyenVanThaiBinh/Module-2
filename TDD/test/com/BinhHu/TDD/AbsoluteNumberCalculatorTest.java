package com.BinhHu.TDD;

import org.junit.jupiter.api.*;





class AbsoluteNumberCalculatorTest {

    @Test
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

    private void assertEquals(int expected, int result) {

    }
}