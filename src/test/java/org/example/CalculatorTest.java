
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {
    @Test
    void addtwovaluesshouldreturnsum() {
        Calculator calculator = new Calculator();

        int result = calculator.add("1.0", "1.2");

        assertEquals(2.0, result);

    }

}

