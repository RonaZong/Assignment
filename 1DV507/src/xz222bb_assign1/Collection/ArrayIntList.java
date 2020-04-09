package xz222bb_assign1.Collection;

public class ArrayIntList extends AbstractIntCollection implements IntList{
    public ArrayIntList() {
    }

    @Override
    /* Add integer n to the end of the list */
    public void add(int n) {
        values[size++] = n;
        if (size == values.length) {
            resize();
        }
    }

    @Override
    /* Inserts integer n at position index.
     * Shifts the element currently at that position (if any) and any subsequent elements to the right. */
    public void addAt(int n, int index) throws IndexOutOfBoundsException {
        checkIndex(index,size+1);
        /* Shift right and add new value */
        if (size - index >= 0) System.arraycopy(values, index, values, index + 1, size - index);
        size++;
        values[index] = n;

        /* resize */
        if (size == values.length) { // increase size
            resize();
        }
    }

    @Override
    /* Remove integer at position index. */
    public void remove(int index) throws IndexOutOfBoundsException {
        checkIndex(index,size);
        if (size - index >= 0) System.arraycopy(values, index + 1, values, index, size - index);
        size--;
    }

    @Override
    /* Get integer at position index. */
    public int get(int index) throws IndexOutOfBoundsException {
        checkIndex(index, size);
        return values[index];
    }

    @Override
    /* Find position of integer n, otherwise return -1 */
    public int indexOf(int n) {
        for (int i=0;i<size;i++) {
            if (values[i]==n)
                return i;
        }
        return -1;
    }

    public void resize() {
        int[] tmp = new int[2 * values.length];
        System.arraycopy(values, 0, tmp, 0, values.length);
        values = tmp;
    }
}
