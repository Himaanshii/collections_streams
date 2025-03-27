package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilityTest {
    @Test
    void testReverse() {
        assertEquals("olleH", StringUtility.reverse("Hello"));
        assertEquals("avaJ", StringUtility.reverse("Java"));
        assertEquals("", StringUtility.reverse(""));
        assertNull(StringUtility.reverse(null));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtility.isPalindrome("madam"));
        assertTrue(StringUtility.isPalindrome("racecar"));
        assertTrue(StringUtility.isPalindrome("Mom")); // Case-insensitive
        assertFalse(StringUtility.isPalindrome("hello"));
        assertFalse(StringUtility.isPalindrome(null));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtility.toUpperCase("hello"));
        assertEquals("JAVA", StringUtility.toUpperCase("Java"));
        assertEquals("", StringUtility.toUpperCase(""));
        assertNull(StringUtility.toUpperCase(null));
    }

}