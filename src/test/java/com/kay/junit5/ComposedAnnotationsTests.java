package com.kay.junit5;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ComposedAnnotations
 * JUnit Jupiter annotations can be used as meta-annotations.
 * That means that you can define your own composed annotation that will
 * automatically inherit the semantics of its meta-annotations.
 *
 * Dynamic
 */
public class ComposedAnnotationsTests {

    @Tag("fast")
    @Test
    void fastTest() {

    }

    @Fast
    @Test
    void fastTestByFastComposedAnnotation() {
        assertEquals(3, 3);
    }

    @FastTest
    void fastTestByFastTestComposedAnnotation() {
        assertEquals(3, 3);
    }
}
