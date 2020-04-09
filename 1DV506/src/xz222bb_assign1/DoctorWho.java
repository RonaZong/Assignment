package xz222bb_assign1;

import java.util.Scanner;

public class DoctorWho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What year? ");
        int year = input.nextInt();

        if (year >= 2020)
            System.out.println("No news on a doctor yet, but one can hope!");
        else if (year >= 2006)
            System.out.println("That is the modern doctor.");
        else if (year >= 1989)
            System.out.println("That year it was a pause.");
        else if (year >= 1963)
            System.out.println("That was the original series.");

        input.close();
    }
}
