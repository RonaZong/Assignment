package xz222bb_assign1.FiFo.Code;

public class QueueMain {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();

        queue.enqueue(5);
        System.out.println("(1) " + queue);
        System.out.println("Size: " + queue.size());

        queue.enqueue(25);
        System.out.println("(2) " + queue);
        System.out.println("Size: " + queue.size());

        queue.enqueue(349);
        queue.enqueue(210);
        System.out.println("(3) " + queue);
        System.out.println("Size: " + queue.size());

        System.out.println("(4) " + queue.dequeue());
        System.out.println("Size: " + queue.size());

        System.out.println("(5) " + queue);
        System.out.println("Size: " + queue.size());

        System.out.println("(6) " + queue.first());
        System.out.println("Size: " + queue.size());

        System.out.println("(7) " + queue.last());
        System.out.println("Size: " + queue.size());

    }
}
