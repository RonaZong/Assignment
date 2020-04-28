package xz222bb_assign2.Queue;

import java.util.Iterator;

public class LinkedQueue<T> implements Queue<T> {
    private int size = 0;
    private Node head, tail;

    /**
     * constructor for a node
     *
     */
    private class Node {
        T element;
        Node next;

        public Node(T element) {
            this.element = element;
        }
    }

    /**
     * empty constructor
     */
    public LinkedQueue() {
    }

    /**
     * checks size of linked queue
     * @return returns the size of linked queue
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * checks if linked queue is empty
     * @return returns if linked queue is empty
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * method to enqueue a node
     * @param element int to insert
     */
    @Override
    public void enqueue(T element) {
        Node newNode = new Node(element);

        if (tail == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    /**
     * dequeues an element from the queue
     * @return returns the last element
     * @throws RuntimeException in case it is empty
     */
    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("The list is empty");
        }
        else {
            Node temp = head;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return temp.element;
        }
    }

    /**
     * return first element in queue
     * @throws RuntimeException if the list is empty
     * @return returns first element in queue
     */
    @Override
    public T first() {
        if (isEmpty()) {
            throw new RuntimeException("The list is empty");
        }
        else {
            return head.element;
        }
    }

    /**
     * return first element in queue
     *  @throws RuntimeException if the list is empty
     *  @return returns last element in queue
     */
    @Override
    public T last() {
        if (isEmpty()){
            throw new RuntimeException("The list is empty");
        }
        else {
            return tail.element;
        }
    }

    /**create a new queue iterator
     * @return generates a new iterator
     */
    @Override
    public Iterator<T> iterator() {
        return new LinkedQueueIterator();
    }


    /**
     * iterator implementation for queue
     *
     */
    private class LinkedQueueIterator implements Iterator<T> {
        private Node current = head;

        /**
         * @return if next element is not null, return true
         */
        @Override

        public boolean hasNext() {
            return current != null;
        }

        /**
         * @return returns next element in queue
         */
        @Override
        public T next() {
            T e = current.element;
            current = current.next;
            return e;
        }
    }

    /**return a string representation of queue
     * @return string representation of queue
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(", ");
            }
            else {
                result.append("]");
            }
        }
        return result.toString();
    }
}