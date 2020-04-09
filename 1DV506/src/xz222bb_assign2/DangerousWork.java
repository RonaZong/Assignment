package xz222bb_assign2;

import java.util.Scanner;

public class DangerousWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How much would you like to earn? ");
        double salary = input.nextDouble();
        int days = 0;
        double totalSalary = 0.01;

        while (totalSalary <= salary) {
                totalSalary *= 2;
                days++;
            }

        if (days >30)
            System.out.println("You probably won't survive working more than 30 days.");
        else
            System.out.print("You will have your money in " + days + " days.");

        input.close();
    }
}
