package org.zzlnico.factorial;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases:
 * factorial 0 -> 1
 * factorial 1 -> 1
 * factorial 2 -> 2
 * factorial 3 -> 6
 * factorial negative number -> raises an exception
 */

class FactorialTest {
    private Factorial factorial;

    @BeforeEach
    public void setup() {
        factorial = new Factorial();
    }

    @AfterEach
    public void finish() {
        factorial = null;
    }

    @Test
    @DisplayName("factorial 0 -> 1")
    public void shouldComputeReturnOneIfTheNumberIsZero() {
        int expectedValue = 1;
        Integer obtainedValue = factorial.compute(0);

        assertNotNull(obtainedValue, "The actual value is null");
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    @DisplayName("factorial 1 -> 1")
    public void shouldComputeReturnOneIfTheNumberIsOne() {
        int expectedValue = 1;
        Integer obtainedValue = factorial.compute(1);

        assertNotNull(obtainedValue, "The actual value is null");
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    @DisplayName("factorial 2 -> 2")
    public void shouldComputeReturnTwoIfTheNumberIsTwo() {
        int expectedValue = 2;
        Integer obtainedValue = factorial.compute(2);

        assertNotNull(obtainedValue, "The actual value is null");
        assertEquals(expectedValue, obtainedValue);
    }
    
    @Test
    @DisplayName("factorial 3-> 6")
    public void shouldComputeReturnSixIfTheNumberIsThree() {
        int expectedValue = 6;
        Integer obtainedValue = factorial.compute(3);

        assertNotNull(obtainedValue, "The actual value is null");
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    @DisplayName("factorial 6 -> 720")
    public void shouldComputeReturn720IfTheNumberIsSix() {
        int expectedValue = 720;
        Integer obtainedValue = factorial.compute(6);

        assertNotNull(obtainedValue, "The actual value is null");
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    @DisplayName("factorial negative number -> raises an exception")
    public void shouldComputeOfANegativeNumberRaiseAnException() {
        assertThrows(RuntimeException.class, () -> factorial.compute(-1));
    }

}