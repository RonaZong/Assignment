package xz222bb_assign4.BinHeap.Exercise10;

public class Main {
    public static void main(String[] args) {
        BinaryHeapQueue binaryHeapQueue = new BinaryHeapQueue();

        Task task1 = new WorkTask(4, "abcdefg");
        binaryHeapQueue.insert(task1);

        Task task2 = new WorkTask(1, "hijklmn");
        binaryHeapQueue.insert(task2);

        Task task3 = new WorkTask(3, "opqrst");
        binaryHeapQueue.insert(task3);

        Task task4 = new WorkTask(2, "uvwxyz");
        binaryHeapQueue.insert(task4);

        for (int i = 1; i <= binaryHeapQueue.size(); i++) {
            System.out.println(binaryHeapQueue.tasks[i].getPriority()
                    + "\t" + binaryHeapQueue.tasks[i].getDescription());
        }

        System.out.println("\n" + binaryHeapQueue.pullHighest().toString());
    }
}
