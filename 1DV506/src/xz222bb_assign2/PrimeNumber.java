package xz222bb_assign2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give me a number: ");
        int number = input.nextInt();

        while (number > 0) {
            if (isPrime(number)) {
                System.out.println("This is a prime number.");
            }
            else {
                System.out.println("This is not a prime number.");
            }
            System.out.print("Give me a number: ");
            number = input.nextInt();

        }
        System.out.println("Good bye!");

        input.close();
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
