package java_junit.src.test;

import java_junit.src.main.IsEven;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class IsEvenTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int number) {
        boolean expected = (number % 2 == 0);
        assertEquals(expected, IsEven.isEven(number));
    }

}