package com.os.operando;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestInfoDemo {

    @Test
    @DisplayName("test")
    @Tag("test info")
    void test(TestInfo testInfo) {
        assertEquals("test", testInfo.getDisplayName());
        assertTrue(testInfo.getTags().contains("test info"));
    }
}
