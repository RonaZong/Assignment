package xz222bb_assign4.BinHeap.Exercise10;

public class BinaryHeapQueue implements PriorityQueue{
    public Task[] tasks;
    private int size;

    public BinaryHeapQueue() {
        // Constructs an empty heap
        tasks = new Task[10];
        size = 0;
        tasks[0] = new WorkTask(Integer.MAX_VALUE, "");
    }

    @Override
    public void insert(Task t) {
        tasks[++size] = t;
        int current = size;

        while (tasks[current].getPriority() > tasks[getParent(current)].getPriority()) {
            swap(current, getParent(current));
            current = getParent(current);
        }

        if (size == tasks.length) {
            resize();
        }
    }

    private void swap(int a, int b) {
        Task temp = tasks[a];
        tasks[a] = tasks[b];
        tasks[b] = temp;
    }

    private void resize(){
        Task[] temp = new Task[2 * tasks.length];
        System.arraycopy(tasks, 1, temp, 1,tasks.length - 1);
        tasks = temp;
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

    @Override
    public Task pullHighest() { // Return and remove element with highest priority
        Task highest = tasks[1];
        tasks[1] = tasks[size--];

        int current = 1;

        if (current >= (size / 2) && current <= size) {
        }
        else {
            while (tasks[current].getPriority() < tasks[getLeftChild(current)].getPriority() || tasks[current].getPriority() < tasks[getRightChild(current)].getPriority()) {
                if (tasks[getLeftChild(current)].getPriority() > tasks[getRightChild(current)].getPriority()) {
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

    @Override
    public Task peekHighest() {
        if (size == 0) {
            throw new IllegalArgumentException("The tree is empty");
        }
        return tasks[1];
    }

    @Override
    public boolean contain(Task t) {
        for (Task a : tasks) {
            if (a == t) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }
}
