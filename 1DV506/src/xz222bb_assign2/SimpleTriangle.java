package xz222bb_assign2;

import java.util.Scanner;

public class SimpleTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        int i, j;

        for (i = 0; i < number; i++) {
            for (j = 2 * i ; j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = number; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        input.close();
    }
}