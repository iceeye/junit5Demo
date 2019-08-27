package com.kay.junit5.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * parameterized.MethodSource
 *
 * source from : https://junit.org/junit5/docs/current/user-guide/
 */
public class MethodSourceTests {
    /**
     * @MethodSource允许你引用测试类或外部类中的一个或多个工厂 方法。
     * 除非使用@TestInstance(Lifecycle.PER_CLASS)注解标注测试类，否则测试类中的工厂方法必须
     * 是static的。 而外部类中的工厂方法必须始终是static的。 此外，此类工厂方法不能接受任何参数。
     */
    @ParameterizedTest
    @MethodSource("stringProvider")
    void testWithSimpleMethodSource(String argument) {
        assertNotNull(argument);
    }

    static Stream<String> stringProvider() {
        return Stream.of("apple", "banana");
    }

    /**
     * If you do not explicitly provide a factory method name via @MethodSource,
     * JUnit Jupiter will search for a factory method that has the same name as the current @ParameterizedTest method by
     * convention. This is demonstrated in the following example.
     * @param argument
     */
    @ParameterizedTest
    @MethodSource
    void testWithSimpleMethodSourceHavingNoValue(String argument) {
        assertNotNull(argument);
    }

    static Stream<String> testWithSimpleMethodSourceHavingNoValue() {
        return Stream.of("apple", "banana");
    }

    /**
     * Streams for primitive types (DoubleStream, IntStream, and LongStream)
     * are also supported as demonstrated by the following example.
     * @param argument
     */
    @ParameterizedTest
    @MethodSource("range")
    void testWithRangeMethodSource(int argument) {
        assertNotEquals(9, argument);
    }

    static IntStream range() {
        return IntStream.range(0, 20).skip(10);
    }

    /**
     * If a parameterized test method declares multiple parameters, you need to return
     * a collection, stream, or array of Arguments instances or object arrays as shown below
     * @param str
     * @param num
     * @param list
     */
    @ParameterizedTest
    @MethodSource("stringIntAndListProvider")
    void testWithMultiArgMethodSource(String str, int num, List<String> list) {
        assertEquals(5, str.length());
        assertTrue(num >= 1 && num <= 2);
        assertEquals(2, list.size());
    }

    static Stream<Arguments> stringIntAndListProvider() {
        return Stream.of(
                Arguments.of("apple", 1, Arrays.asList("a", "b")),
                Arguments.of("lemon", 2, Arrays.asList("x", "y"))
        );
    }
}
