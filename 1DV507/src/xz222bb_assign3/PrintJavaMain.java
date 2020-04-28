package xz222bb_assign3;

import java.io.*;

public class PrintJavaMain {
    public static void main(String[] args) throws IOException {
        File directory = new File("1DV507/src/xz222bb_assign3");
        printAllJavaFiles(directory);
    }

    private static void printAllJavaFiles(File directory) throws IOException {
        if (!directory.isDirectory()) {
            ;
        } else {
            File[] subs = directory.listFiles();
            for (File file : subs) {
                int count = 0;
                printAllJavaFiles(file);
                if (file.getName().endsWith(".java")) {
                    System.out.print(file.getName());
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    while (bufferedReader.readLine() != null) {
                        count++;
                    }
                    System.out.println("\tThe number of rows is " + count);
                }
            }
        }
    }
}
