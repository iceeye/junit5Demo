package com.kay.junit5;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Even though the assertion facilities provided by JUnit Jupiter are sufficient for many testing scenarios,
 * there are times when more power and additional functionality such as matchers are desired or required.
 * In such cases, the JUnit team recommends the use of third-party assertion libraries
 * such as AssertJ, Hamcrest, Truth, etc. Developers are therefore free to use the assertion library of their choice.
 *
 * For example, the combination of matchers and a fluent API can be used to make assertions
 * more descriptive and readable.
 *
 * source from : https://junit.org/junit5/docs/current/user-guide/
 */
public class HamcrestAssertionTests {
    private final Calculator calculator = new Calculator();

    @Test
    void assertWithHamcrestMatcher() {
        assertThat(calculator.subtract(4, 1), is(equalTo(3)));
    }
}
