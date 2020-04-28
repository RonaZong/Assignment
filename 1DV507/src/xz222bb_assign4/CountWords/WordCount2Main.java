package xz222bb_assign4.CountWords;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class WordCount2Main {
    public static void main(String[] args) throws IOException {
        File file = new File("1DV507/src/xz222bb_assign4/CountWords/HistoryOfProgramming.txt");
        Scanner input = new Scanner(file);

        HashWordSet wordHashSet = new HashWordSet();
        TreeWordSet wordTreeSet = new TreeWordSet();

        while (input.hasNext()) {
            Word word = new Word(input.next());
            wordHashSet.add(word);
            wordTreeSet.add(word);
        }

        System.out.println("The size of wordHashSet is " + wordHashSet.size());
        System.out.println("The size of wordTreeSet is " + wordTreeSet.size());

        System.out.println("HashWordSet iterator:");
        Iterator<Word> iteratorHashSet = wordHashSet.iterator();
        while (iteratorHashSet.hasNext()) {
            System.out.println(iteratorHashSet.next());
        }

        System.out.println("TreeWordSet iterator:");
        Iterator<Word> iteratorTreeSet = wordTreeSet.iterator();
        while (iteratorTreeSet.hasNext()) {
            System.out.println(iteratorTreeSet.next());
        }

        input.close();
    }
}
