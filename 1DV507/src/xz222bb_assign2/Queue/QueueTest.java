package xz222bb_assign2.Queue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    private static int count = 0;

    /* Executed before every test method */
    @BeforeEach
    public void setUp() {
        System.out.println("Run test method: " + (count++));
    }

    /* Executed after every test method */
    @AfterEach
    public void tearDown() {
        System.out.println(" --- done with test " + count);
    }

    /* My list of test methods */
    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void enqueue() {
    }

    @Test
    void dequeue() {
    }

    @Test
    void first() {
    }

    @Test
    void last() {
    }

    @Test
    void testToString() {
    }
}