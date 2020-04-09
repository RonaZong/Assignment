package xz222bb_assign2;

import java.util.Scanner;

public class Bricks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width = 0;

        while (width >= 0) {
            System.out.print("Lego Builder\n\nWidth: ");
            width = input.nextInt();
            if (width < 0) {
                System.out.println("Bye!"); System.exit(1);
            }
            System.out.print("Height: ");
            int height = input.nextInt();

            int[][] lego = new int[height][width];

            building(lego);
        }

        input.close();
    }

    public static String building(int[][] brick) {
        System.out.print("┌");
        for (int j = 0; j < brick[0].length; j++) {
            System.out.print("─"); // Ogham Space MArk
        }
        System.out.print("┐\n");

        for (int i = 0; i < brick.length; i++) {
            System.out.print("│"); // vertical line
            for (int j = 0; j < brick[0].length; j++) {
                System.out.print("●"); // middle dot
            }
            System.out.print("│\n");
        }

        System.out.print("└");
        for (int j = 0; j < brick[0].length; j++) {
            System.out.print("─"); // Ogham Space MArk
        }
        System.out.print("┘\n");


//        for (int row = 0; row < brick.length; row++) {
//            if (row == 0) {
//                System.out.print("┌");
//                for (int j = 0; j < brick[0].length; j++) {
//                    System.out.print("─"); // Ogham Space MArk
//                }
//                System.out.print("┐\n");
//            } else if (row == brick.length - 1) {
//                System.out.print("└");
//                for (int j = 0; j < brick[0].length; j++) {
//                    System.out.print("─"); // Ogham Space MArk
//                }
//                System.out.print("┘\n");
//            } else {
//                for (int i = 0; i < brick.length; i++) {
//                    System.out.print("│"); // vertical line
//                    for (int j = 0; j < brick[0].length; j++) {
//                        System.out.print("●"); // middle dot
//                    }
//                    System.out.print("│\n");
//                }
//            }
        return null;
    }
}
