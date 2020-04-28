package xz222bb_assign3;

public class EuclideanMain {
    public static void main(String[] args) {
        System.out.println("GCD(0, 12) = " + GCD(0, 12));
        System.out.println("GCD(18, 12) = " + GCD(18, 12));
        System.out.println("GCD(42, 56) = " + GCD(42, 56));
        System.out.println("GCD(9, 28) = " + GCD(9, 28));
    }

    public static int GCD(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        }
        if (n2 == 0) {
            return n1;
        }
        int gcd = 1;
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
}
