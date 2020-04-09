package xz222bb_assign2;

public class Histogram {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;

        for (int NUMBER_OF_DICES = 1; NUMBER_OF_DICES <= 500; NUMBER_OF_DICES++) {
            int n = (int) (Math.random() * 6 + 1);

            if (n == 1) {
                num1++;
            }
            if (n == 2) {
                num2++;
            }
            if (n == 3) {
                num3++;
            }
            if (n == 4) {
                num4++;
            }
            if (n == 5) {
                num5++;
            }
            if (n == 6) {
                num6++;
            }
        }

        System.out.print("One(" + num1 + "): ");
        for (int n1 = 0; n1 < num1; n1++) {
            System.out.print("*");
        }

        System.out.print("\nTwo(" + num2 + "): ");
        for (int n2 = 0; n2 < num2; n2++) {
            System.out.print("*");
        }

        System.out.print("\nThree(" + num3 + "): ");
        for (int n3 = 0; n3 < num3; n3++) {
            System.out.print("*");
        }

        System.out.print("\nFour(" + num4 + "): ");
        for (int n4 = 0; n4 < num4; n4++) {
            System.out.print("*");
        }

        System.out.print("\nFive(" + num5 + "): ");
        for (int n5 = 0; n5 < num5; n5++) {
            System.out.print("*");
        }

        System.out.print("\nSix(" + num6 + "): ");
        for (int n6 = 0; n6 < num6; n6++) {
            System.out.print("*");
        }

    }
}
