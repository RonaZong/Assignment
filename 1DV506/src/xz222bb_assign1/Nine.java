package xz222bb_assign1;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Player rolls
        int playerDice1 = (int)(Math.random() * 6 + 1);
        int playerDice2 = (int)(Math.random() * 6 + 1);

        System.out.print("Ready to play? (Y/N) ");
        String Q1 = input.nextLine();
        if (Q1.equals("Y")) {
            System.out.println("You rolled " + playerDice1);
        }
        else if (Q1.equals("N")) {
            System.out.println("Game finished");
        }

        System.out.print("Would you like to roll again? (Y/N) ");
        String Q2 = input.nextLine();
        if (Q2.equals("Y")) {
            System.out.println("You rolled " + playerDice2 + " and in total you have " + (playerDice1 + playerDice2));
        }
        else if (Q2.equals("N")) {
            playerDice2 = 0;
            System.out.println("In total you have " + playerDice1);
        }

        // Computer rolls
        int computerDice1 = (int)(Math.random() * 6 + 1);
        int computerDice2 = (int)(Math.random() * 6 + 1);

        System.out.println("The computer rolled " + computerDice1);
        if (computerDice1 <= 4) {
            System.out.println("The computer rolls again and gets " + computerDice2 + " in total " + (computerDice1 + computerDice2));
        }
        else {
            computerDice2 = 0;
            System.out.println("The computer rolls in total " + computerDice1);
        }

        // Compare which one closest to nine
        if ((playerDice1 + playerDice2) <= 9 && (computerDice1 + computerDice2) <= 9) {
            if ((playerDice1 + playerDice2) > (computerDice1 + computerDice2)) {
                System.out.println("You won!");
            }
            else if ((playerDice1 + playerDice2) == (computerDice1 + computerDice2)) {
                System.out.println("Neither you or computer won");
            }
            else if ((playerDice1 + playerDice2) < (computerDice1 + computerDice2)) {
                System.out.println("Computer won!");
            }
        }

        // When players get ten or more
        else if ((playerDice1 + playerDice2) > 9) {
            System.out.println("You are fat and you lose.");
        }
        else if ((computerDice1 + computerDice2) > 9) {
            System.out.println("Computer is fat and computer loses.");
        }

        input.close();
    }
}
