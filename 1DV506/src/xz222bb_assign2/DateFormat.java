package xz222bb_assign2;

import java.util.Scanner;

public class DateFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month (number): ");
        int month = input.nextInt();
        System.out.print("Enter a day (number): ");
        int day = input.nextInt();
        System.out.print("Enter a format (b/l/m): ");

        Scanner format = new Scanner(System.in);
        String endian = format.nextLine();

        if (endian.equals("b")) {
            big_endian(year, month, day);
        }
        else if (endian.equals("l")) {
            little_endian(year, month, day);
        }
        else if (endian.equals("m")) {
            middle_endian(year, month, day);
        }

        input.close();
    }

    public static void big_endian (int year, int month, int day) {
        if (month >= 1 && month <= 9)
            System.out.println(year + "/0" + month + "/" + day);
        else if (month <= 12)
            System.out.println(year + "/" + month + "/" + day);
    }

    public static void little_endian (int year, int month, int day) {
        if (month >= 1 && month <= 9)
            System.out.println(day + "/0" + month + "/" + year);
        else if (month <= 12)
            System.out.println(day + "/" + month + "/" + year);
    }

    public static void middle_endian (int year, int month, int day)  {
        if (month >= 1 && month <= 9)
            System.out.println(month + "/0" + day + "/" + year);
        else if (month <= 12)
            System.out.println(month + "/" + day + "/" + year);
    }
}
