package xz222bb_assign1.ArrayQueue;

public class QueueMain {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(4);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        for (int i : queue.array) {
            System.out.print(i + " ");
        }
        System.out.println("\nFirst index: " + queue.first() + "\nLast index: " + queue.last() + "\n");

        queue.enqueue(4);
        for (int i : queue.array) {
            System.out.print(i + " ");
        }
        System.out.println("\nFirst index: " + queue.first() + "\nLast index: " + queue.last() + "\n");

        queue.dequeue();
        for (int i : queue.array) {
            System.out.print(i + " ");
        }
        System.out.println("\nFirst index: " + queue.first() + "\nLast index: " + queue.last() + "\n");

        queue.dequeue();
        queue.dequeue();
        for (int i : queue.array) {
            System.out.print(i + " ");
        }
        System.out.println("\nFirst index: " + queue.first() + "\nLast index: " + queue.last() + "\n");

        queue.dequeue();
        for (int i : queue.array) {
            System.out.print(i + " ");
        }
        System.out.println("\nFirst index: " + queue.first() + "\nLast index: " + queue.last() + "\n");

        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        for (int i : queue.array) {
            System.out.print(i + " ");
        }
        System.out.println("\nFirst index: " + queue.first() + "\nLast index: " + queue.last() + "\n");
    }
}
