package com.kay.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

/**
 * Timeout
 *
 * 42 @Timeout(42)
 * 42 ns @Timeout(value = 42, unit = NANOSECONDS)
 * 42 μs  @Timeout(value = 42, unit = MICROSECONDS)
 * 42 ms  @Timeout(value = 42, unit = MILLISECONDS)
 * 42 s @Timeout(value = 42, unit = SECONDS)
 * 42 m  @Timeout(value = 42, unit = MINUTES)
 * 42 h @Timeout(value = 42, unit = HOURS)
 * 42 d @Timeout(value = 42, unit = DAYS)
 *
 * source from : https://junit.org/junit5/docs/current/user-guide/
 */
public class TimeoutTests {
    @BeforeEach
    @Timeout(5)
    void setUp() {
        // fails if execution time exceeds 5 seconds
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void failsIfExecutionTimeExceeds100Milliseconds() {
        // fails if execution time exceeds 100 milliseconds
    }

/*    @Test
    @Timeout(5) // Poll at most 5 seconds
    void pollUntil() throws InterruptedException {
        while (asynchronousResultNotAvailable()) {
            Thread.sleep(250); // custom poll interval
        }
        // Obtain the asynchronous result and perform assertions
    }*/
}
