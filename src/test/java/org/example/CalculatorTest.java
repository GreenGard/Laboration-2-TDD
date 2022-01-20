
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {
    @Test
    void addtwovaluesshouldreturnsum() {
        Calculator calculator = new Calculator();

        int result = calculator.add("1,2");

        assertEquals(3, result);

    }

    @Test
    void emptyStringShouldBeValid() {
        Calculator calculator = new Calculator();

        var result = calculator.add("");

        assertTrue(result == 0);
    }
    @Test
    void addManyNumbers() {
        Calculator calculator = new Calculator();

        var result = calculator.add("1,2,3,4");

        assertTrue(result == 10);

    }
    @Test
    void allowLinesBetweenNumbers() {
        Calculator calculator = new Calculator();

        var result = calculator.add("1\n2,3,");

        assertTrue(result == 6);

    }
    @Test
    void addDifferentDelimiters() {
        Calculator calculator = new Calculator();

        var result = calculator.add("//;n1;2");

        assertTrue(result == 3);

    }
}

