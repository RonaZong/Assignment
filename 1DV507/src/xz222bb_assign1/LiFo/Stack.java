package xz222bb_assign1.LiFo;

public class Stack implements StringStack {
    private int size = 0;
    private String[] stack;

    public Stack(int size) {
        stack = new String[size];
        if (size >= stack.length) {
            resize();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String[] getStack() {
        return stack;
    }

    public void setStack(String[] stack) {
        this.stack = stack;

        if (size >= stack.length) {
            resize();
        }
    }

    @Override /** Current stack size */
    public int size() {
        for (String s : stack) {
            if (s != null)
                size++;
        }
        return size;
    }

    @Override /** true if stack is empty */
    public boolean isEmpty() {
        return size == 0 || stack[0] == null;
    }

    @Override /** Add element at top of stack */
    public void push(String element) {
        stack[size++] = element;

        if (size >= stack.length) {
            resize();
        }
    }

    private void resize() {
        String[] tmp = new String[2 * stack.length];
        System.arraycopy(stack, 0, tmp, 0, stack.length);
        stack = tmp;
    }

    @Override /** Return and remove top element, exception if stack is empty */
    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        else {
            String element = this.stack[size - 1];
            stack[size] = null;
            size--;
            return element;
        }
    }

    @Override /** Return (without removing) top element, exception if stack is empty. */
    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[size - 1];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(stack[i] + " ");
        }
    }
}
