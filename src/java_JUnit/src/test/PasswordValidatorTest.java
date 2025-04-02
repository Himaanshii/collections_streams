package java_junit.src.test;

import java_junit.src.main.PasswordValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    @Test
    void testValidPasswords() {
        assertTrue(PasswordValidator.strength("StrongPass1"));
        assertTrue(PasswordValidator.strength("Hello123"));
    }

    @Test
    void testInvalidPasswords() {
        assertFalse(PasswordValidator.strength("short1"));       // Less than 8 chars
        assertFalse(PasswordValidator.strength("nouppercase1")); // No uppercase letter
        assertFalse(PasswordValidator.strength("NoDigitHere"));  // No digit
    }

}