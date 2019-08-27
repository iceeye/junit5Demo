package com.kay.junit5.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * parameterized.CsvSource
 *
 * source from : https://junit.org/junit5/docs/current/user-guide/
 */
public class CsvSourceTests {
    @ParameterizedTest
    @CsvSource({
            "foo, 1",
            "foo, 1"
    })
    void csvSourceParamTest(String str, int i) {
        assertEquals("foo", str);
        assertEquals(1, i);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/two-column.csv")
    void testWithCsvFileSource(String first, int second) {
        assertNotNull(first);
        assertNotEquals(0, second);
    }
}
