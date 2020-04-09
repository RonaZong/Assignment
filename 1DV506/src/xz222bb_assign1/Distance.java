package xz222bb_assign1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Point x1: ");
        double x1 = input.nextDouble();
        System.out.print("Point y1: ");
        double y1 = input.nextDouble();
        System.out.print("Point x2: ");
        double x2 = input.nextDouble();
        System.out.print("Point y2: ");
        double y2 = input.nextDouble();
        double distance = Math.sqrt(Math.pow((x1 - x2) , 2) + Math.pow((y1 - y2) , 2));
        DecimalFormat format = new DecimalFormat("##.000");
        System.out.println("The distance is: " + format.format(distance));

        input.close();
    }
}
