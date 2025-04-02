package java_junit.src.test;

import java_junit.src.main.UserRegistration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UserRegistrationTest {
    @Test
    public void testValidUserRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("JohnDoe", "john@example.com", "SecurePass1"));
    }

    @Test
    public void testInvalidUserRegistration() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "john@example.com", "SecurePass1")); // Empty username
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "invalid-email", "SecurePass1")); // Invalid email
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "john@example.com", "short")); // Password too short
    }
  
}