package xz222bb_assign2.Queue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest<T> {
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
    @Test public void size() {
        LinkedQueue<Integer> queue1 = build(0);
        assertEquals(0, queue1.size());

        LinkedQueue<String> queue2 = build(2);
        assertEquals(2, queue2.size());
    }

    @Test public void isEmpty() {
        LinkedQueue<Integer> queue1 = build(0);
        assertTrue(queue1.isEmpty());

        LinkedQueue<String> queue2 = build(4);
        assertFalse(queue2.isEmpty());
    }

    @Test public void enqueue() {
        LinkedQueue<Integer> queue1 = build(4);
        queue1.enqueue(4);
        assertEquals(4, queue1.last());
        assertEquals(5, queue1.size());
        queue1.enqueue(23);
        assertEquals(23, queue1.last());
        assertEquals(6, queue1.size());

        LinkedQueue<String> queue2 = build(2);
        queue2.enqueue("a");
        assertEquals("a", queue2.last());
        assertEquals(3, queue2.size());
        queue2.enqueue("b");
        assertEquals("b", queue2.last());
        assertEquals(4, queue2.size());
    }

    @Test public void dequeue() {
        LinkedQueue<Integer> queue1 = build(4);
        queue1.enqueue(4);
        queue1.dequeue();
        assertEquals(1, queue1.first());
        assertEquals(4, queue1.size());
        queue1.enqueue(23);
        queue1.dequeue();
        assertEquals(2, queue1.first());
        assertEquals(4, queue1.size());

        LinkedQueue<String> queue2 = build(2);
        queue2.enqueue("a");
        queue2.dequeue();
        assertEquals(1, queue2.first());
        assertEquals(2, queue2.size());
        queue2.enqueue("b");
        queue2.dequeue();
        assertEquals("a", queue2.first());
        assertEquals(2, queue2.size());

        LinkedQueue<String> queue3 = build(0);
        assertThrows(RuntimeException.class, queue3::dequeue);
    }

    @Test public void first() {
        LinkedQueue<Integer> queue1 = build(4);
        queue1.enqueue(4);
        queue1.dequeue();
        assertEquals(1, queue1.first());
        assertEquals(4, queue1.size());
        queue1.enqueue(23);
        queue1.dequeue();
        assertEquals(2, queue1.first());
        assertEquals(4, queue1.size());

        LinkedQueue<String> queue2 = build(2);
        queue2.enqueue("a");
        queue2.dequeue();
        assertEquals(1, queue2.first());
        assertEquals(2, queue2.size());
        queue2.enqueue("b");
        queue2.dequeue();
        assertEquals("a", queue2.first());
        assertEquals(2, queue2.size());

        LinkedQueue<String> queue3 = build(0);
        assertThrows(RuntimeException.class, queue3::first);
    }

    @Test public void last() {
        LinkedQueue<Integer> queue1 = build(4);
        queue1.enqueue(4);
        assertEquals(4, queue1.last());
        assertEquals(5, queue1.size());
        queue1.enqueue(23);
        assertEquals(23, queue1.last());
        assertEquals(6, queue1.size());

        LinkedQueue<String> queue2 = build(2);
        queue2.enqueue("a");
        assertEquals("a", queue2.last());
        assertEquals(3, queue2.size());
        queue2.enqueue("b");
        assertEquals("b", queue2.last());
        assertEquals(4, queue2.size());
    }

    @Test public void testToString() {
        LinkedQueue<Integer> queue1 = build(4);
        queue1.enqueue(4);
        queue1.dequeue();
        queue1.enqueue(23);
        queue1.dequeue();
        assertEquals("[2, 3, 4, 23]", queue1.toString());


        LinkedQueue<String> queue2 = build(2);
        queue2.enqueue("a");
        queue2.dequeue();
        queue2.enqueue("b");
        queue2.dequeue();
        assertEquals("[a, b]", queue2.toString());


        LinkedQueue<String> queue3 = build(0);
        assertEquals("[", queue3.toString());

    }

    private LinkedQueue build (int size) {
        LinkedQueue<Object> queue = new LinkedQueue<>();
        for (int i = 0; i < size; i++) {
            queue.enqueue(i);
        }
        return queue;
    }
}