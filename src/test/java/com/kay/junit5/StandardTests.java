package com.kay.junit5;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Test Class: any top-level class, static member class, or @Nested class that contains at least one test method.
 *              Test classes must not be abstract and must have a single constructor.
 *
 * Test Method: any instance method that is directly annotated or meta-annotated
 *              with @Test, @RepeatedTest, @ParameterizedTest, @TestFactory, or @TestTemplate.
 *
 * Lifecycle Method: any method that is directly annotated or meta-annotated
 *                   with @BeforeAll, @AfterAll, @BeforeEach, or @AfterEach.
 *
 * Test classes, test methods, and lifecycle methods are not required to be public, but they must not be private.
 *
 * source from : https://junit.org/junit5/docs/current/user-guide/
 */
@Slf4j
public class StandardTests {


    @BeforeAll
    static void initAll() {
        log.info("initAll");
    }

    @BeforeEach
    void init() {
        log.info("before each method.");
    }

    @Test
    void succeedingTest() {
        log.info("a succeeding test");
    }

    @Test
    void failingTest() {
        fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @Test
    void abortedTest() {
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }

    @AfterEach
    void tearDown() {
        log.info("after each method.");
    }

    @AfterAll
    static void tearDownAll() {
        log.info("after all test, tear down all.");
    }

}
