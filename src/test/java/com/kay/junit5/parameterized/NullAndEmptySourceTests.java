package com.kay.junit5.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
/**
 * parameterized.NullAndEmptySource
 *
 * @NullSource: provides a single null argument to the annotated @ParameterizedTest method.
 *  - @NullSource cannot be used for a parameter that has a primitive type.
 * @EmptySource: provides a single empty argument to the annotated @ParameterizedTest method for parameters of
 * the following types: java.lang.String, java.util.List, java.util.Set, java.util.Map, primitive arrays
 * (e.g., int[], char[][], etc.), object arrays (e.g.,String[], Integer[][], etc.).
 *  - Subtypes of the supported types are not supported.
 * @NullAndEmptySource: a composed annotation that combines the functionality of @NullSource and @EmptySource.
 *
 * source from : https://junit.org/junit5/docs/current/user-guide/
 */
public class NullAndEmptySourceTests {

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = { " ", "   ", "\t", "\n" })
    void nullEmptyAndBlankStrings(String text) {
        assertTrue(text == null || text.trim().isEmpty());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " ", "   ", "\t", "\n" })
    void nullEmptyAndBlankStringsByNullAndEmptySource(String text) {
        assertTrue(text == null || text.trim().isEmpty());
    }
}
