package com.kay.junit5.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;

import static org.junit.jupiter.api.condition.JRE.*;

/**
 *  Java Runtime Environment Conditions
 *
 * A container or test may be enabled or disabled on a particular version of the Java Runtime Environment (JRE) via
 * the @EnabledOnJre and @DisabledOnJre annotations.
 *
 * source from : https://junit.org/junit5/docs/current/user-guide/
 */
public class JreConditionsTests {
    @Test
    @EnabledOnJre(JAVA_8)
    void onlyOnJava8() {
        // ...
    }

    @Test
    @EnabledOnJre({ JAVA_9, JAVA_10 })
    void onJava9Or10() {
        // ...
    }

    @Test
    @DisabledOnJre(JAVA_9)
    void notOnJava9() {
        // ...
    }
}
