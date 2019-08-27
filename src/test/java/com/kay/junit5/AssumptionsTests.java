package com.kay.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

/**
 * 假设 org.junit.jupiter.api.Assumptions
 * Assume直译为假设，是JUnit提供的一套用于判断测试用例的入参是否有业务含义的工具，
 * 如果入参不符合预期时会抛出AssumptionViolatedException，
 * 默认的BlockJUnit4ClassRunner及其子类会捕获这个异常并跳过当前测试
 *
 * Assume提供的验证方法包括： assumeTrue/assumeFalse、 assumeNotNull、 assumeThat、 assumeNoException
 */
public class AssumptionsTests {
    private final Calculator calculator = new Calculator();

    @Test
    void testOnlyOnCiServer() {
        assumeTrue("CI".equals(System.getenv("ENV")));
        // remainder of test
    }

    @Test
    void testOnlyOnDeveloperWorkstation() {
        assumeTrue("DEV".equals(System.getenv("ENV")),
                () -> "Aborting test: not on developer workstation");
        // remainder of test
    }

    @Test
    void testInAllEnvironments() {
        assumingThat("CI".equals(System.getenv("ENV")),
                () -> {
                    // perform these assertions only on the CI server
                    assertEquals(2, calculator.divide(4, 2));
                });

        // perform these assertions in all environments
        assertEquals(42, calculator.multiply(6, 7));
    }

}
