package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class userRegistrationTest {
    @Test
    public void testValidUserRegistration() {
        assertDoesNotThrow(() -> userRegistration.registerUser("JohnDoe", "john@example.com", "SecurePass1"));
    }

    @Test
    public void testInvalidUserRegistration() {
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("", "john@example.com", "SecurePass1")); // Empty username
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("JohnDoe", "invalid-email", "SecurePass1")); // Invalid email
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("JohnDoe", "john@example.com", "short")); // Password too short
    }
}