package xz222bb_assign1.ArrayQueue;

import java.util.Iterator;

public class ArrayQueue implements IntQueue{
        int[] array;
        private int size = 0; // current size
        private int first = -1;
        private int last = -1;

        public ArrayQueue(int size) {
            array = new int[size];
        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public boolean isEmpty() {
            return size == 0;
        }

        @Override
        public void enqueue(int element) {
            if (size == array.length) {
                resize();
                last = (last + 1) % array.length;
                array[last] = element;
                size++;
            }
            else if (isEmpty()) {
                first++;
                last = (last + 1) % array.length;
                array[last] = element;
                size++;
            }
            else {
                last = (last + 1) % array.length;
                array[last] = element;
                size++;
            }
        }

        @Override
        public int dequeue() {
            if (isEmpty()) {
                throw new RuntimeException("The list is empty");
            }
            else if (first == last) {
                array[first] = 0;
                size--;
                first = -1;
                last = -1;
            }
            else {
                array[first] = 0;
                size--;
                first++;
            }
            return 0;
        }

        @Override
        public int first() {
            return first;
        }

        @Override
        public int last() {
            return last;
        }

        private void resize() {
            int[] tmp = new int[2 * array.length];
            System.arraycopy(array, 0, tmp, 0, array.length);
            array = tmp;
            first = 0;
            last = array.length / 2 - 1;
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            result.append("[ ");

            for (int value : array) {
                result.append(value).append(" ");
            }
            result.append("]");

            return result.toString();
        }

        public Iterator<Integer> iterator() {
            return new ArrayQueueIterator();
        }

        private class ArrayQueueIterator implements Iterator<Integer> {
            private int current = 0;

            @Override
            public boolean hasNext() {
                return current < size;
            }

            @Override
            public Integer next() {
                return array[current++];
            }
        }
}
