package com.kay.junit5.disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * A @Disabled test method.
 * source : https://junit.org/junit5/docs/current/user-guide/
 */
public class DisabledMethodTests {
    @Disabled("Disabled until bug #42 has been resolved")
    @Test
    void testWillBeSkipped() {
    }

    @Test
    void testWillBeExecuted() {
    }
}
