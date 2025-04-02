package java_junit.src.test;

import java_junit.src.main.StringUtilityMethods;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilityMethodsTest {
    @Test
    void testReverse() {
        assertEquals("olleH", StringUtilityMethods.reverse("Hello"));
        assertEquals("avaJ", StringUtilityMethods.reverse("Java"));
        assertEquals("", StringUtilityMethods.reverse(""));
        assertNull(StringUtilityMethods.reverse(null));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtilityMethods.isPalindrome("madam"));
        assertTrue(StringUtilityMethods.isPalindrome("racecar"));
        assertTrue(StringUtilityMethods.isPalindrome("Mom")); // Case-insensitive
        assertFalse(StringUtilityMethods.isPalindrome("hello"));
        assertFalse(StringUtilityMethods.isPalindrome(null));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtilityMethods.toUpperCase("hello"));
        assertEquals("JAVA", StringUtilityMethods.toUpperCase("Java"));
        assertEquals("", StringUtilityMethods.toUpperCase(""));
        assertNull(StringUtilityMethods.toUpperCase(null));
    }

}

