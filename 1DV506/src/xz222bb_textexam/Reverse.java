package xz222bb_textexam;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print(reverse(arr).toString());

    }

    public static int[] reverse(int[] arr) {
        int i = arr.length;
        int[] rev = new int[i];
        for (int k = 0; k < i; k++) {
            int pos = i - 1 - k;
            rev[k] = arr[pos];
        }
        return rev;
    }
}
