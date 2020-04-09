package xz222bb_assign1;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give a number of seconds: ");
        int seconds = input.nextInt();
        int hours = seconds / (60 * 60);
        int remainingSeconds = seconds % (60 * 60);
        int minutes = remainingSeconds / 60;
        int currentSeconds = remainingSeconds % 60;

        System.out.println("This corresponds to: " + hours + " hours, " + minutes + " minutes and " + currentSeconds + " seconds.");

        input.close();
    }
}
