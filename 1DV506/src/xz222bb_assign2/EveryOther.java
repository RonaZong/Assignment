package xz222bb_assign2;

import java.io.InputStream;
import java.util.Scanner;

public class EveryOther {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First number: ");
        int number1 = input.nextInt();

        System.out.print("Second number: ");
        int number2 = input.nextInt();

        for (int i = 2; (number1 < number2); number1 += i) {
            System.out.print(number1 + " ");
        }

        input.close();
    }
}
