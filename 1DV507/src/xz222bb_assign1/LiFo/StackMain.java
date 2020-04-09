package xz222bb_assign1.LiFo;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack(8);

        System.out.println("Testing " + stack.getClass().getName());
        stack.push("a");
        System.out.print("\n(1) ");
        stack.print();
        System.out.print("\nSize: " + stack.getSize());


        stack.push("b");
        stack.push("c");
        stack.push("d");
        System.out.print("\n(2) ");
        stack.print();
        System.out.print("\nSize: " + stack.getSize());

        System.out.print("\n(3) Remove peek " + stack.pop());
        System.out.print("\nSize: " + stack.getSize());


        System.out.print("\n(4) The peek is " + stack.peek());
        System.out.print("\nSize: " + stack.getSize());

    }
}
