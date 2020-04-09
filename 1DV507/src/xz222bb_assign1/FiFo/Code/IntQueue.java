package xz222bb_assign1.FiFo.Code;

/**
 * Basic int queue implementation, basic functions of queue (FIFO linear data structure)
 */
public interface IntQueue extends Iterable<Integer> {
    /** returns size of an int queue
     * @return size of an int queue
     */
    public int size();                     // current queue size

    /** checks if int queue is empty
     * @return true if int queue is empty
     */
    public boolean isEmpty();              // true if queue is empty

    /** queues an int to queue (add to last position)
     * @param element int to queue
     */
    public void enqueue(int element);   // add element at end of queue

    /** dequeues an int from queue (remove first element)
     * @return first element in queue and removes it from queue
     */
    public int dequeue();               // return and remove first element.

    /** returns the first element in queue (without removing it)
     * @return first element in queue
     */
    public int first();                 // return (without removing) first element

    /** returns the last element in queue (without removing it)
     * @return last element in queue
     */
    public int last();                  // return (without removing) last element

    /**returns a string representation of the queue
     * @return string representation of queue
     */
    public String toString();              // return a string representation of the queue content
}