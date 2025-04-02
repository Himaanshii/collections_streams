package java_junit.src.test;

import java_junit.src.main.LongRunningTask;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class LongRunningTaskTest {
    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS) // Fails if execution time exceeds 2 seconds
    void testLongRunningTaskTimeout() {
        LongRunningTask task = new LongRunningTask();
        LongRunningTask.longRunningTask(); // This should fail since it takes 3 seconds
    }
}