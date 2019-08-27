package com.kay.junit5;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * Syntax Rules for Tags
 *
 * A tag must not be null or blank.
 * A trimmed tag must not contain whitespace.
 * A trimmed tag must not contain ISO control characters.
 * A trimmed tag must not contain any of the following reserved characters.
 *      ,: comma
 *      (: left parenthesis
 *      ): right parenthesis
 *      &: ampersand
 *      |: vertical bar
 *      !: exclamation point
 *
 * source from : https://junit.org/junit5/docs/current/user-guide/
 */
@Tag("fast")
@Tag("model")
public class TagsTests {

    @Test
    @Tag("taxes")
    void testingTaxCalculation() {
    }
}
