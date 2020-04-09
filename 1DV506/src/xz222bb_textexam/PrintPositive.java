package xz222bb_textexam;

import java.util.Scanner;

public class PrintPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give a number of integers: ");
        int n = input.nextInt();
        int[] numberOfIntegers = new int[n];

        for (int k = 0; k < n; k++){
            System.out.print("\tnumber " + (k + 1) + ": ");
            numberOfIntegers[k] = input.nextInt();
        }

        System.out.print("Positive numbers: ");
        for (int k = 0; k < n; k++) {
            if (numberOfIntegers[k] > 0) {
                System.out.print(numberOfIntegers[k] + " ");
            }
        }
    }
}
