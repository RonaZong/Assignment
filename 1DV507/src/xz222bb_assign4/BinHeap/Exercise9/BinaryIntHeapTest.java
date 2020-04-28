package xz222bb_assign4.BinHeap.Exercise9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryIntHeapTest {

    @Test
    void insert() {
        BinaryIntHeap binaryIntHeap = new BinaryIntHeap();
        binaryIntHeap.insert(3);
        assertEquals(1,binaryIntHeap.size());
        binaryIntHeap.insert(4);
        assertEquals(2,binaryIntHeap.size());
        binaryIntHeap.insert(8);
        assertEquals(8, binaryIntHeap.pullHighest());
    }

    @Test
    void pullHighest() {
        BinaryIntHeap binaryIntHeap = new BinaryIntHeap();
        binaryIntHeap.insert(4);
        binaryIntHeap.insert(6);

        assertEquals(6, binaryIntHeap.pullHighest());
        assertEquals(4, binaryIntHeap.pullHighest());
    }

    @Test
    void size() {
        BinaryIntHeap binaryIntHeap = new BinaryIntHeap();
        binaryIntHeap.insert(10);
        assertEquals(1,binaryIntHeap.size());
        binaryIntHeap.insert(3);
        assertEquals(2,binaryIntHeap.size());
    }

    @Test
    void isEmpty() {
        BinaryIntHeap binaryIntHeap = new BinaryIntHeap();
        assertTrue(binaryIntHeap.isEmpty());
        binaryIntHeap.insert(1);
        assertFalse(binaryIntHeap.isEmpty());
        binaryIntHeap.pullHighest();
    }
}