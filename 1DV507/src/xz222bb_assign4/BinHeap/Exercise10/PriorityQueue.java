package xz222bb_assign4.BinHeap.Exercise10;

public interface PriorityQueue {
    void insert(Task t); // Add n to heap
    Task pullHighest();    // Return and remove element with highest priority
    Task peekHighest();    // Return and not remove element with highest priority
    boolean contain(Task t);
    int size();         // Current heap size
    boolean isEmpty(); // True if heap is empty
}
