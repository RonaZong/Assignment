package xz222bb_assign2.WarAndPeace;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class WarAndPeace {
    public static void main(String[] args) throws IOException {
        String text = readText("C:\\Java\\IdeaProjects\\Assignment\\1DV507\\src\\xz222bb_assign2\\WarAndPeace\\WarAndPeace.txt");
        String[] words = text.split(" ");  // Simple split, will be cleaned up later on
        System.out.println("Initial word count: " + words.length);  // 577091

        Stream<String> stream = Arrays.stream(words);
        //all characters except ' -
        String regEx="\\p{Punct}".replaceAll("'—-","");
        long uniqueWords = stream.filter(WarAndPeace::isWord).
                map(String :: toLowerCase).
                map(n -> n.replaceAll("\\p{Punct}", "")).
                map(n -> n.replaceAll("\\d+", "")).
                distinct().count();
        System.out.println("Number of unique words: " + uniqueWords);
    }

    private static String readText(String str) throws IOException {
        BufferedReader br =  new BufferedReader(new FileReader(str));
        String line;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(new FileReader(str)));
        while((line = br.readLine()) != null){
            stringBuilder.append(line).append(" ");
        }
        return stringBuilder.toString();
    }
    public static boolean isWord(String s) {
        try{
            int i = Integer.parseInt(s);
            return false;
        }
        catch (RuntimeException e){
            return true;
        }
    }
}
