package xz222bb_assign4.CountWords;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class HashWordSet implements WordSet {
    private int sz;
    private Node[] buckets = new Node[8];

    private class Node {
        Word element;
        Node next = null;

        public Node(Word word) {
            this.element = word;
        }

        public String toString() {
            return element.toString();
        }
    }

    @Override
    public void add(Word word) {
        int pos = getBucketNumber(word);
        Node node = buckets[pos];
        while (node != null) {
            if (node.element.equals(word)) {
                return;
            } else
                node = node.next;
        }

        node = new Node(word);
        node.next = buckets[pos];
        buckets[pos] = node;
        sz++;
        if (sz == buckets.length) {
            rehash();
        }
    }

    private int getBucketNumber(Word word) {
        int hc = word.hashCode();
        if (hc < 0) {
            hc = -hc;
        }
        return hc % buckets.length;
    }

    private void rehash() {
        Node[] temp = buckets;
        buckets = new Node[2 * temp.length];
        sz = 0;
        for (Node n : temp) {
            if (n == null) {
                continue;
            }
            while (n != null) {
                add(n.element);
                n = n.next;
            }
        }
    }

    @Override
    public boolean contains(Word word) {
        int pos = getBucketNumber(word);
        Node node = buckets[pos];
        while (node != null) {
            if (node.element.equals(word)) {
                return true;
            } else
                node = node.next;
        }
        return false;
    }

    @Override
    public int size() {
        return this.sz;
    }



    @Override
    public Iterator<Word> iterator() {
        return new WordHashSetIterator();
    }

    private class WordHashSetIterator implements Iterator<Word>{
        private int pos;
        private Node current;

        public WordHashSetIterator(){
            pos = 0;
            current = null;
        }

        @Override
        public boolean hasNext() {
            if (current != null && current.next != null)
                return true;
            for (int i = pos; i < buckets.length; i++){
                if (buckets[i] != null)
                    return true;
            }
            return false;
        }

        @Override
        public Word next() {
            if (current != null && current.next != null) {
                current = current.next;
            } else {
                do {
                    if (pos == buckets.length) {
                        throw new NoSuchElementException();
                    }
                    current = buckets[pos];
                    pos++;
                } while (current == null);
            }
            return current.element;
        }
    }
}
