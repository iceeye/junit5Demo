package com.kay.junit5.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

/**
 *  System Property Conditions
 *
 *  A container or test may be enabled or disabled based on the value of the named JVM system property via
 *  the @EnabledIfSystemProperty and @DisabledIfSystemProperty annotations. The value supplied via
 *  the matches attribute will be interpreted as a regular expression.
 *
 *  source from : https://junit.org/junit5/docs/current/user-guide/
 */
public class SystemPropertyConditionsTests {
    @Test
    @EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
    void onlyOn64BitArchitectures() {
        // ...
    }

    @Test
    @DisabledIfSystemProperty(named = "ci-server", matches = "true")
    void notOnCiServer() {
        // ...
    }
}
