package xz222bb_assign4.CountWords;

import java.util.Iterator;

public class TreeWordSet implements WordSet {
    private BST root = null;
    private Word[] words = new Word[8];
    private int sz = 0;
    private int count = 0;

    private class BST {
        Word element;
        BST left = null;
        BST right = null;

        public BST(Word word) {
            this.element = word;
        }

        private void add(Word word) { // Recursive add
            if (word.compareTo(element) < 0) { // Add to left branch
                if (left == null) {
                    left = new BST(word);
                    sz++;
                } else
                    left.add(word); // Recursive call
            } else if (word.compareTo(element) > 0) { // Add to right branch
                if (right == null) {
                    right = new BST(word);
                    sz++;
                } else
                    right.add(word);
            }
        }

        private boolean contains(Word word) {
            if (word.compareTo(element) < 0) {
                if (left == null)
                    return false;
                else
                    return left.contains(word);
            } else if (word.compareTo(element) > 0) {
                if (right == null)
                    return false;
                else
                    return right.contains(word);
            }
            return true;
        }

        private Word[] getWord(){
            if (left != null){
                left.getWord();
            }
            if (count == words.length){
                reHash();
            }
            words[count] = element;
            count++;
            if (right != null){
                right.getWord();
            }
            return words;
        }

        private void reHash(){
            Word[] temp = new Word[2 * words.length];
            System.arraycopy(words, 0, temp, 0, words.length);
            words = temp;
        }
    }

    @Override
    public void add(Word word) {
        if (root == null) {
            root = new BST(word);
            sz++;
        }
        else
            root.add(word);
    }

    @Override
    public boolean contains(Word word) {
        if (sz == 0) {
            return false;
        }
        else
            return root.contains(word);
    }

    @Override
    public int size() {
        return this.sz;
    }

    @Override
    public Iterator<Word> iterator() {
        return new WordTreeSetIterator();
    }

    private class WordTreeSetIterator implements Iterator<Word>{
        private int count = 0;

        public WordTreeSetIterator() {
            root.getWord();
        }

        @Override
        public boolean hasNext() {
            if (root == null){
                return false;
            }
            else if (words[count] == null){
                return false;
            }
            else
                return count  < words.length;
        }

        @Override
        public Word next() {
            return words[count++];
        }
    }
}
