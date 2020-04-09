package xz222bb_assign2;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_INTEGERS = 10;
        int count = 1;
        System.out.print("Provide 10 integers: ");

        int number, secondLargest, Largest;
        number = input.nextInt();
        Largest = number;
        secondLargest = number;

        while (count < NUMBER_OF_INTEGERS) {
            number = input.nextInt();
            if (number > Largest) {
                secondLargest = Largest;
                Largest = number;
            }
            count++;
        }

        System.out.println("Second biggest number is: " + secondLargest);

        input.close();
    }
}
