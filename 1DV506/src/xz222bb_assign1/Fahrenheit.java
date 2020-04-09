package xz222bb_assign1;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Provide a temperature in Fahrenheit: ");
        double F = input.nextDouble();
        double C = (F - 32) / 9 * 5;
        System.out.println("Corresponding temperature in Celsius is " + C);

        input.close();
    }
}
