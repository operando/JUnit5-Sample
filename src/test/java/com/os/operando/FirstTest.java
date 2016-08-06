package com.os.operando;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.expectThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@Tag("first")
@DisplayName("first test")
public class FirstTest {

    @Test
    @Tag("first")
    @DisplayName("first test!!")
    void test() {
        assertEquals(2, 1 + 1);

        assertAll("address",
                () -> assertEquals("John", "test"),
                () -> assertEquals("User", "User")
        );
    }

    @Test
    void exceptionTesting() {
        Throwable throwable = expectThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("aaaa");
        });
        assertEquals("aaaa", throwable.getMessage());
    }

    @Test
    void testOnlyOnCi() {
        assumeTrue("CI".equals(System.getenv("ENV")));
    }
}