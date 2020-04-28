package xz222bb_assign4.BinHeap.Exercise9;

public class BinaryIntHeap {
    public int[] heap;
    private int size;

    public BinaryIntHeap() {  // Constructs an empty heap
        heap = new int[10];
        size = 0;
        heap[0] = Integer.MAX_VALUE;
    }

    public void insert(int n) { // Add n to heap
        heap[++size] = n;
        int current = size;

        while (heap[current] > heap[getParent(current)]) {
            swap(current, getParent(current));
            current = getParent(current);
        }

        if (size == heap.length) {
            resize();
        }
    }

    private void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    private void resize(){
        int[] temp = new int[2 * heap.length];
        System.arraycopy(heap, 0, temp, 0,heap.length);
        heap = temp;
    }

    private int getParent(int n) {
        return n / 2;
    }

    private int getLeftChild(int n) {
        return (2 * n);
    }

    private int getRightChild(int n) {
        return (2 * n) + 1;
    }

    public int pullHighest() { // Return and remove element with highest priority
        int highest = heap[1];
        heap[1] = heap[size--];

        int current = 1;

        if (current >= (size / 2) && current <= size) {
        }
        else {
            while (heap[current] < heap[getLeftChild(current)] || heap[current] < heap[getRightChild(current)]) {
                if (heap[getLeftChild(current)] > heap[getRightChild(current)]) {
                    swap(current, getLeftChild(current));
                    current = getLeftChild(current);
                } else {
                    swap(current, getRightChild(current));
                    current = getRightChild(current);
                }
            }
        }
        return highest;
    }

    public int size() { // Current heap size
        return this.size;
    }

    public boolean isEmpty() { // True if heap is empty
        return this.size == 0;
    }
}
