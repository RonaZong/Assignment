package xz222bb_assign2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word or sentence: ");
        String t = input.nextLine();

        while (!t.equals("stop")) {
            if (palindrome(t))
                System.out.println("That was a palindrome.");

            else
                System.out.println("That wasn't a palindrome.");

            System.out.print("Enter a word or sentence: ");
            t = input.nextLine();

        }

        input.close();
    }

    public static boolean palindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();

        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }
}
