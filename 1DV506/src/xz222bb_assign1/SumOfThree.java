package xz222bb_assign1;

import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Provide a three digit number: ");
        int number = input.nextInt();
        int units = number % 10;
        int tens = (number - units) % 100 / 10;
        int hundreds = (number - tens * 10 - units) / 100;
        int sum = units + tens + hundreds;

        System.out.println("Sum of digits: " + sum);

        input.close();
    }
}
