package xz222bb_textexam;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("A positive upper boundary N: ");
        int N = input.nextInt();
        System.out.println("Divisible numbers in range 1 to " + N + "\n");

        final int j = 10;
        int count = 0;

        for (int i = 1; i < N; i++) {
            if (i % 6 == 0 || i % 7 == 0) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0)
                    System.out.println();
            }

        }

    }
}
