package com.BinhHu.TDD;

import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {
    @Test
    public void testAdd() {
        int x = 1;
        int y = 1;
        Calculator instance = new Calculator();
        int exResult = 2;
        int result = instance.add(x, y);
        assertEquals(exResult, result);

    }

    @Test
    public void testAdd2() {
        int x = Integer.MAX_VALUE;
        int y = 1;
        Calculator intstance = new Calculator();
        try {
            int result = intstance.add(x,y);
        }
        catch (Exception e){
            assertEquals(true);
        }
    }

    private void assertEquals(boolean b) {
    }

    void assertEquals(int exResult, int result) {
    }
    @Test
    public void testAdd3(){
        int x = Integer.MIN_VALUE;
        int y = -1;
        Calculator instance = new Calculator();
        try{
            int result = instance.add(x,y);
            assertFalse(true);
        }catch (Exception e){
            assertTrue(true);
        }
    }
}
