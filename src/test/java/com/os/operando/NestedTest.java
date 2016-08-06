package com.os.operando;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NestedTest {

    @Test
    void test() {
        assertTrue(true == true);
    }

    @Nested
    @DisplayName("Nested Test")
    class StringTest {

        @Test
        void empty() {
            assertEquals("", "");
        }
    }
}
