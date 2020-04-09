package xz222bb_assign2;

import java.util.Scanner;

public class CalcNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give me a number: ");
        int number = input.nextInt();

        int sum = 0;
        while (number != 0) {
            sum += number;

            System.out.print("Give me a number: ");
            number = input.nextInt();
        }

        System.out.println("The sum is: " + sum);

        input.close();
    }
}
