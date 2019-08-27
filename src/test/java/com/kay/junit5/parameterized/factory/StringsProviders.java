package com.kay.junit5.parameterized.factory;

import java.util.stream.Stream;

public class StringsProviders {
    static Stream<String> tinyStrings() {
        return Stream.of(".", "oo", "OOO");
    }
}
