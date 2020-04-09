package xz222bb_assign1;

import javax.swing.*;
import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Payment: ");
        double payment = input.nextDouble();
        double change = Math.round(payment - price);

        int thousands = (int)(change / 1000);
        double remainingChange = change - thousands;
        int fiveHundreds = (int)(remainingChange / 500);
        remainingChange = remainingChange - fiveHundreds * 500;
        int twoHundreds = (int)(remainingChange / 200);
        remainingChange = remainingChange - twoHundreds * 200;
        int oneHundreds = (int)(remainingChange / 100);
        remainingChange = remainingChange - oneHundreds * 100;
        int fiveTens =  (int)(remainingChange / 50);
        remainingChange = remainingChange - fiveTens * 50;
        int twoTens = (int)(remainingChange / 20);
        remainingChange = remainingChange - twoTens * 20;
        int oneTens = (int)(remainingChange / 10);
        remainingChange = remainingChange - oneTens * 10;
        int fiveUnits = (int)(remainingChange / 5);
        remainingChange = remainingChange - fiveUnits * 5;
        int twoUnits = (int)(remainingChange / 2);
        remainingChange = remainingChange - twoUnits * 2;
        int oneUnits = (int)(remainingChange / 1);

        System.out.println("Change: " + change +
                "\n1000 kr bills: " + thousands +
                "\n500 kr bills: " + fiveHundreds +
                "\n200 kr bills: " + twoHundreds +
                "\n100 kr bills: " + oneHundreds +
                "\n50 kr bills: " + fiveTens +
                "\n20 kr bills: " + twoTens +
                "\n10 kr coins: " + oneTens +
                "\n5 kr coins: " + fiveUnits +
                "\n2 kr coins: " + twoUnits +
                "\n1 kr coins: " + oneUnits);

        input.close();
    }
}
