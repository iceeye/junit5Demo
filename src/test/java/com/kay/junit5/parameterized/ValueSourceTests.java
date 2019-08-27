package com.kay.junit5.parameterized;

import com.kay.junit5.utils.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * parameterized.ValueSource
 * source from : https://junit.org/junit5/docs/current/user-guide/
 */
public class ValueSourceTests {

    /**
     * The following types of literal values are supported by @ValueSource.
     *  short / byte / int / long / float / double / char / boolean / java.lang.String / java.lang.Class
     * @param candidate
     */
    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    void palindromes(String candidate) {
        Assertions.assertTrue(StringUtils.isPalindrome(candidate));
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    void testWithValueSource(int argument) {
        assertTrue(argument > 0 && argument < 4);
    }

    @DisplayName("Display name of container")
    @ParameterizedTest(name = "{index} ==> first=''{0}'', second={1}")
    @CsvSource({ "foo, 1", "bar, 2", "'baz, qux', 3" })
    void testWithCustomDisplayNames(String first, int second) {
    }

}

