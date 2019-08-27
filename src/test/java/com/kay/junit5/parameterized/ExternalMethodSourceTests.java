package com.kay.junit5.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * An external, static factory method can be referenced by providing its
 * fully qualified method name as demonstrated in the following example.
 * source from : https://junit.org/junit5/docs/current/user-guide/
 */
public class ExternalMethodSourceTests {

    @ParameterizedTest
    @MethodSource("com.kay.junit5.parameterized.factory.StringsProviders#tinyStrings")
    void testWithExternalMethodSource(String tinyString) {
        // test with tiny string
    }
}