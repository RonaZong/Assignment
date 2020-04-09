package xz222bb_assign1.ArrayQueue;

public interface IntQueue {
    int size();                  // current queue size
    boolean isEmpty();           // true if queue is empty
    void enqueue(int element);   // add element at end of queue
    int dequeue();               // return and remove first element.
    int first();                 // return (without removing) first element
    int last();                  // return (without removing) last element
    String toString();           // return a string representation of the queue content
}
