package xz222bb_assign1.Collection;

public class ArrayIntStack extends AbstractIntCollection implements IntStack{
    public ArrayIntStack() {
    }

    @Override /* Add integer at top of stack. */
    public void push(int n) {
        values[size++] = n;
    }

    @Override /* Returns and removes integer at top of stack */
    public int pop() throws IndexOutOfBoundsException {
        return values[size--];
    }

    @Override /* Returns without removing integer at top of stack */
    public int peek() throws IndexOutOfBoundsException {
        return values[size - 1];
    }
}
