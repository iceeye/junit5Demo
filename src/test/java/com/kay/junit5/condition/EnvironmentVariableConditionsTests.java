package com.kay.junit5.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

/**
 * Environment Variable Conditions
 *
 * A container or test may be enabled or disabled based on the value of the named environment variable from
 * the underlying operating system via the @EnabledIfEnvironmentVariable and @DisabledIfEnvironmentVariable
 * annotations. The value supplied via the matches attribute will be interpreted as a regular expression.
 *
 * source from : https://junit.org/junit5/docs/current/user-guide/
 */
public class EnvironmentVariableConditionsTests {

    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "staging-server")
    void onlyOnStagingServer() {
        // ...
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "ENV", matches = ".*development.*")
    void notOnDeveloperWorkstation() {
        // ...
    }
}
