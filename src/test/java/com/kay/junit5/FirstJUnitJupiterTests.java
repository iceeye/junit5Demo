package com.kay.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A first test case
 *
 * source from : https://junit.org/junit5/docs/current/user-guide/
 */
public class FirstJUnitJupiterTests {
    private final Calculator calculator = new Calculator();

    @Test
    void addition() {
        assertEquals(3, calculator.add(1, 2));
    }

}
