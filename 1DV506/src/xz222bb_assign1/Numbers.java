package xz222bb_assign1;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        int number1 = input.nextInt();
        System.out.print("Second number: ");
        int number2 = input.nextInt();
        System.out.print("Third number: ");
        int number3 = input.nextInt();

        // Compare
        if (number1 > number2 && number2 > number3) {
            int temp1 = number1;
            number1 = number3;
            number3 = temp1;
            System.out.println("Correct order: " + number1 + " " + number2 + " " + number3);
        }

        else if (number1 < number2 && number2 > number3) {
            int temp2 = number2;
            number2 = number3;
            number3 = temp2;
            System.out.println("Correct order: " + number1 + " " + number2 + " " + number3);
        }

        else if (number1 < number2 && number2 < number3)
            System.out.println("Correct order: " + number1 + " " + number2 + " " + number3);

        input.close();
    }
}
