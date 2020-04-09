package xz222bb_assign4;

import java.io.File;
import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Yun\\IdeaProjects\\Assignment\\1DV506\\src\\xz222bb_assign4\\lovecraft.txt");
        Scanner input = new Scanner(file);

        int linesTotal = 0;
        int emptyLines = 0;
        int textLines = 0;
        int pageNumber = 0;

        while (input.hasNext()) {
            String str = input.nextLine();
            linesTotal++;
            if (str.isEmpty()) {
                emptyLines++;
            }
            else if (input.hasNext() && !checkNumber(str))
                textLines++;
            else if (checkNumber(str))
                pageNumber++;

        }

        System.out.println("Lovecraft statistics: " +
                "\nTotal lines: " + linesTotal +
                "\nEmpty lines: " + emptyLines +
                "\nLines with text: " + textLines +
                "\nLines with page number: " + pageNumber);

        input.close();
    }

    private static boolean checkNumber(String str) {
        for (int n = 0; n < str.length(); n++) {
            if (str.charAt(n) >= 48 && str.charAt(n) <= 57 && str.length() <= 5) {
                return true;
            }
        }
        return false;
    }
}
