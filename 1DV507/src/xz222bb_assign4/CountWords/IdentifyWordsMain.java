package xz222bb_assign4.CountWords;

import java.io.*;

public class IdentifyWordsMain {
    public static void main(String[] args) throws IOException {
        File file = new File("1DV507/src/xz222bb_assign4/CountWords/HistoryOfProgramming.txt");

        File newFile = new File("1DV507/src/xz222bb_assign4/CountWords/words.txt");

        BufferedReader bf = new BufferedReader(new FileReader(file));
        BufferedWriter output = new BufferedWriter(new FileWriter(newFile));

        String str;

        while (bf.ready()) {
            str = bf.readLine();

            if (!str.isEmpty()) {
                for (int i = 0; i < str.length(); i++) {
                    if (Character.isLetter(str.charAt(i)) || str.charAt(i) == ' ') {
                        output.write(str.charAt(i));
                    }
                }
                output.write("\n");
            }
        }
        output.flush();

        output.close();
    }
}
