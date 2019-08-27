package com.kay.junit5.disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Here’s a @Disabled test class.
 * source : https://junit.org/junit5/docs/current/user-guide/
 */
@Disabled("Disabled until bug #99 has been fixed")
public class DisabledClassTests {
    @Test
    void testWillBeSkipped() {
    }

}
