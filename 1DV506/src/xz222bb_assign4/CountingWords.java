package xz222bb_assign4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CountingWords {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Java\\IdeaProjects\\Assignment\\1DV506\\src\\xz222bb_assign4\\lovecraft.txt");
        Scanner input = new Scanner(file);

        int words = 0;

        while (input.hasNext()) {
            String str = input.nextLine();
            if (str.isEmpty()) {
                words += 0;
            }
            else
                words += count(str);
        }

        System.out.println("Number of words: " + words);
        input.close();
    }


    public static int count(String str) {
        int wordCount = 0;

        char[] characters = str.toCharArray();
        int endOfLine = str.length() - 1;

        for (int i = 0; i < characters.length; i++) {
            if (Character.isLetter(characters[i])) {
                if ((i + 1) == endOfLine) {
                    wordCount++;
                }
                else if (i == endOfLine) {
                    wordCount++;
                }
                else {
                    if (!Character.isWhitespace(characters[i + 1])) {
                        if (!Character.isLetterOrDigit(characters[i + 1])) {
                            wordCount++;
                        }
                    }
                    else {
                        wordCount++;
                    }
                }
            }
        }
        return wordCount;
    }

//    public static int count(String str) {
//        int wordCount = 0;
//
//        char[] characters = str.toCharArray();
//        int endOfLine = str.length() - 1;
//        boolean isWord = false;
//
//        if (str.isEmpty()) {
//            wordCount += 0;
//        }
//        else {
//            for (int i = 0; i < characters.length; i++) {
//                if (Character.isLetter(characters[i]) && i != endOfLine) {
////                    isWord = true;
//                    isWord = false; // alphabets
//                } else if (!Character.isLetter(characters[i]) && isWord) {
//                    wordCount++;
//                    isWord = false;
//                } else if (Character.isLetter(characters[i]) && i == endOfLine) {
////                    wordCount++;
//                }
//                else if (Character.isLetter(characters[i])) {
//                    wordCount++;
//                    isWord = true;
//                }
//            }
//        }
//        return wordCount;
//    }

}
