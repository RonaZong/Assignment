package xz222bb_assign1;

import java.util.Scanner;

public class Quote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please give me something to quote: ");
        String text = input.nextLine();
        System.out.println("You said: " + "\"" + text + "\"");

        input.close();
    }
}
