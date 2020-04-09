package xz222bb_assign1;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Provide radius: ");
        double radius = input.nextDouble();
        double area = 3.14159 * Math.pow(radius , 2);
        System.out.println("Corresponding area is " + (double)Math.round(area * 10) / 10);

        input.close();
    }
}
