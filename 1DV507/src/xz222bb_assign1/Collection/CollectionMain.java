package xz222bb_assign1.Collection;

import java.util.Iterator;

public class CollectionMain {
    public static void main(String[] args) {
        IntList list = new ArrayIntList();
        testList(list);
        IntStack stack = new ArrayIntStack();
        testStack(stack);
    }

    private static void testList(IntList list) {
        System.out.println("Testing " + list.getClass().getName());
        for (int i = 0; i < 10; i++) {
            list.add(i * 10);
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list);
        System.out.println("Size = " + list.size());
        System.out.println("At pos 5: = " + list.get(5));
        System.out.println("At pos 0: = " + list.get(0));
        System.out.println("At pos 9: = " + list.get(9));

        list.remove(9);  // last
        list.remove(0);
        list.remove(4);
        System.out.println(list);
        list.addAt(99, 0);
        list.addAt(99, 3);
        list.addAt(99, 9);  //last
        System.out.println(list);
        System.out.println("Size = " + list.size());
        System.out.println("Index of 99: = " + list.indexOf(99));
        System.out.println("Index of 40: = " + list.indexOf(40));
        System.out.println("Index of 555: = " + list.indexOf(555));

        for (Integer integer : list) System.out.print("  " + integer);
        System.out.println("\n\n");
    }

    private static void testStack(IntStack stack) {
        System.out.println("Testing " + stack.getClass().getName());
        for (int i = 0; i < 10; i++) {
            stack.push(i * 10);
        }
        System.out.println("Size = " + stack.size());
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack.toString());

        for (Integer integer : stack) System.out.print("  " + integer);
        System.out.println("\n\n");
    }
}
