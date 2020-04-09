package xz222bb_assign4;

import java.util.Scanner;

public class SafeDateMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me a year: ");
        int year = input.nextInt();
        if (year == 0) {
            System.out.println("Bye, bye!");
            System.exit(1);
        }
        System.out.print("Give me a month: ");
        int month = input.nextInt();
        System.out.print("Give me a day: ");
        int day = input.nextInt();
        DateFormat birthday = new DateFormat(year, month, day, "/", "l");
        try {
            System.out.println("The date is: " + birthday.getDate(true));
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }

        while (year != 0) {
            System.out.print("Give me a year: ");
            year = input.nextInt();
            if (year == 0) {
                System.out.println("Bye, bye!");
                System.exit(1);
            }
            System.out.print("Give me a month: ");
            month = input.nextInt();
            System.out.print("Give me a day: ");
            day = input.nextInt();
            birthday = new DateFormat(year, month, day, "/", "l");
            try {
                System.out.println("The date is: " + birthday.getDate(true));
            }
            catch (IllegalArgumentException ex) {
                System.out.println(ex);
            }
        }
        input.close();
    }
}
