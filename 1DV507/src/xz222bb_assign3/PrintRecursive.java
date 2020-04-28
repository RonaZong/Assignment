package xz222bb_assign3;

public class PrintRecursive {
    public static void main(String[] args) {
        String str = "Hello Everyone!";

        print(str, 0);
        System.out.println();
        printReverse(str, 0);
    }

    private static void print(String str, int n) {
        if (n == str.length()) {
        } else {
            System.out.print(str.charAt(n));
            print(str, n + 1);
        }
    }

    private static void printReverse(String str, int n) {
        if (n == str.length()) {
        } else {
            printReverse(str, n + 1);
            System.out.print(str.charAt(n));
        }
    }
}
