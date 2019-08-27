package com.kay.junit5.display;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * CustomizingDisplayNames
 * source from : https://junit.org/junit5/docs/current/user-guide/
 */
public class CustomizingDisplayNamesTests {
    @DisplayName("Display name of container")
    @ParameterizedTest(name = "{index} ==> fruit=''{0}'', rank={1}")
    @CsvSource({ "apple, 1", "banana, 2", "'lemon, lime', 3" })
    void testWithCustomDisplayNames(String fruit, int rank) {
    }
}
