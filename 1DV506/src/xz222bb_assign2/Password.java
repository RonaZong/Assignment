package xz222bb_assign2;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        int j = password.length() - 1;

        while (password.length() != 0) {
            if (password.length() - 1 < 10) {
                System.out.print("Enter a password more than 10 characters: ");
                password = input.nextLine();
            } else {
                if (checkUppercase(password) && checkNumber(password) && checkSpecialCharacter(password)) {
                    System.out.println("Password is valid!");
                    break;
                } else {
                    System.out.print("Enter a password: ");
                    password = input.nextLine();
                }
            }
        }
        input.close();
    }

    private static boolean checkUppercase(String password) {
        int u = 0;

        for (int letter = 0; letter <= password.length() - 1; letter++) {
            if (password.charAt(letter) >= 65 && password.charAt(letter) <= 90) {
                u++;
            }
        }

        return u >= 2;
    }

    private static boolean checkNumber(String password) {
        int n = 0;

        for (int letter = 0; letter <= password.length() - 1; letter++) {
            if (password.charAt(letter) >= 48 && password.charAt(letter) <= 57) {
                n++;
            }
        }

        return n >= 2;
    }

    private static boolean checkSpecialCharacter(String password) {
        int s = 0;

        for (int letter = 0; letter <= password.length() - 1; letter++) {
            if ((password.charAt(letter) >= 33 && password.charAt(letter) <= 47) ||
                    (password.charAt(letter) >= 58 && password.charAt(letter) <= 64) ||
                    (password.charAt(letter) >= 91 && password.charAt(letter) <= 96) ||
                    (password.charAt(letter) >= 123 && password.charAt(letter) <= 126)) {
                s++;
            }
        }

        return s >= 2;
    }
}
