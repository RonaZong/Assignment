package xz222bb_assign4.CountWords;

public class Word implements Comparable<Word> {
    private final String word;

    public Word(String str) {
        this.word = str;
    }

    public String toString() {
        return word;
    }

    /* Override Object methods */
    @Override
    public int hashCode() {
        int hc = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            hc += Character.getNumericValue(c);
        }
        return hc;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Word) {
            Word otherWord = (Word) other;
            return word.equals(otherWord.toString());
        }
        return false;
    }

    /* Implement Comparable */
    @Override
    public int compareTo(Word word) {
        return this.word.compareTo(word.word);
    }
}
