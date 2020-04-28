package xz222bb_assign3;

import java.util.Arrays;

public class PascalMain {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pascalRow(10)));
    }

    private static int[] pascalRow(int n) {
        int[] pascal = new int[n + 1];
        pascal[0] = 1;
        pascal[n] = 1;
        if (n == 0) {
            pascal[0] = 1;
        }
        else {
            int[] previous = pascalRow(n - 1);
            for (int i = 1; i < n; i++) {
                pascal[i] = previous[i - 1] + previous[i];
            }
        }

        return pascal;
    }
}
