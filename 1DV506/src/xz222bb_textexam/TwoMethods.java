package xz222bb_textexam;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double i = input.nextDouble();
        String Hej = input.nextLine();

        System.out.println(i);

    }

    public static int[] roundOff(ArrayList<Double> input) {
        Scanner doubles = new Scanner(System.in);
        double j = doubles.nextDouble();
        j = (int)(Math.round(j));

        int[] i = new int[3];

        System.out.print(j);

        return i;
    }

    public static int countHej(String str) {
        String text = "Hej";
        Scanner string = new Scanner(System.in);
        String Hej = string.nextLine();
        int count = 0; // No of Hej

        if (Hej.equals(text))
            count++;

        System.out.print(count);

        return count;
    }
}
