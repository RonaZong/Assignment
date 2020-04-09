package xz222bb_assign2;

import java.util.Scanner;

public class Diamonds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give a positive number: ");
        int number = input.nextInt();
        int i, j;

        while (!(number < 0)) {
            for (i = 1; i <= 2 * number - 1; i += 2) {
                for (j = 2 * number; j >= i; j--) {
                    System.out.print(" ");
                }
                for (j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            for (i = 2 * (number - 1) - 1; i >= 1; i -= 2) {
                for (j = 2 * number + 1; j > i; j--) {
                    System.out.print(" ");
                }
                for (j = i; j > 0; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            System.out.print("Give a positive number: ");
            number = input.nextInt();
        }

        input.close();
    }
}
