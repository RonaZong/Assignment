package xz222bb_assign2.LinkedQueue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedQueueTest {
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
    @Test public void testSize() {
        LinkedQueue queue = build(5);
        assertEquals(5, queue.size());
    }

    @Test public void isEmpty() {
        LinkedQueue queue1 = build(0);
        assertTrue(queue1.isEmpty());

        LinkedQueue queue2 = build(4);
        assertFalse(queue2.isEmpty());
    }

    @Test public void testEnqueue() {
        LinkedQueue queue = build(4);
        queue.enqueue(3);
        assertEquals(3, queue.last());
        assertEquals(5, queue.size());

        queue.enqueue(23);
        assertEquals(23, queue.last());
        assertEquals(6, queue.size());
    }

    @Test public void testDequeue() {
        LinkedQueue queue1 = build(0);
        assertThrows(RuntimeException.class, queue1::dequeue);

        LinkedQueue queue2 = build(4);
        queue2.dequeue();
        assertEquals(1, queue2.first());
        assertEquals(3, queue2.size());

        queue2.enqueue(23);
        queue2.dequeue();
        assertEquals(2, queue2.first());
        assertEquals(3, queue2.size());
    }

    @Test public void first() {
        LinkedQueue queue1 = build(0);
        assertThrows(RuntimeException.class, queue1::first);

        LinkedQueue queue2 = build(4);
        queue2.dequeue();
        assertEquals(1, queue2.first());
        assertEquals(3, queue2.size());

        queue2.enqueue(23);
        queue2.dequeue();
        assertEquals(2, queue2.first());
        assertEquals(3, queue2.size());
    }

    @Test public void last() {
        LinkedQueue queue1 = build(0);
        assertThrows(RuntimeException.class, queue1::last);

        LinkedQueue queue2 = build(4);
        queue2.dequeue();
        assertEquals(3, queue2.last());
        assertEquals(3, queue2.size());

        queue2.enqueue(23);
        queue2.dequeue();
        assertEquals(23, queue2.last());
        assertEquals(3, queue2.size());
    }

    @Test public void testToString() {
        LinkedQueue queue1 = build(0);
        assertEquals("[", queue1.toString());

        LinkedQueue queue2 = build(4);
        queue2.dequeue();
        assertEquals("[1, 2, 3]", queue2.toString());

        queue2.enqueue(23);
        queue2.dequeue();
        assertEquals("[2, 3, 23]", queue2.toString());
    }

    private LinkedQueue build (int size) {
        LinkedQueue queue = new LinkedQueue();
        for (int i = 0; i < size; i++) {
            queue.enqueue(i);
        }
        return queue;
    }
}