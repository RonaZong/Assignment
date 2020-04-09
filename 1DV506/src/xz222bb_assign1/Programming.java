package xz222bb_assign1;

import java.util.Scanner;

public class Programming {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter
        System.out.print("What is the first programming language? ");
        String L1 = input.nextLine();
        String L1copy = L1;
        L1 = L1.toUpperCase();

        System.out.print("And the second? ");
        String L2 = input.nextLine();
        String L2copy = L2;
        L2 = L2.toUpperCase();

        System.out.print("And the third? ");
        String L3 = input.nextLine();
        String L3copy = L3;
        L3 = L3.toUpperCase();

        // Compare when L1 < L2
        if (L1.compareTo(L2) < 0) {
            if (L2.compareTo(L3) < 0) // L1 < L2 < L3
                System.out.println("Alphabetic order is " + L1copy + " " + L2copy + " " + L3copy);
            else {
                if (L1.compareTo(L3) < 0) // L1 < L3 < L2
                    System.out.println("Alphabetic order is " + L1copy + " " + L3copy + " " + L2copy);
                else // L3 < L1 < L2
                    System.out.println("Alphabetic order is " + L3copy + " " + L1copy + " " + L2copy);
            }
        }

        // Compare when L1 > L2
        else {
            if (L3.compareTo(L2) < 0) // L3 < L2 < L1
                System.out.println("Alphabetic order is " + L3copy + " " + L2copy + " " + L1copy);
            else {
                if (L1.compareTo(L3) < 0) // L2 < L1 < L3
                    System.out.println("Alphabetic order is " + L2copy + " " + L1copy + " " + L3copy);
                else // L2 < L3 < L1
                    System.out.println("Alphabetic order is " + L2copy + " " + L3copy + " " + L1copy);
            }
        }

        input.close();
    }
}
