package xz222bb_assign1;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Temperature (C): ");
        double temperature = input.nextDouble();
        System.out.print("Wind speed (m/s): ");
        double speed = input.nextDouble();
        double V = speed / 1000 * 3600;
        double T = 13.12 + 0.6215 * temperature - 11.37 * Math.pow(V , 0.16) + 0.3965 * temperature * Math.pow(V, 0.16);
        System.out.println("Wind Chill Temperature (C): " + (double)Math.round(T * 10) / 10);

        input.close();
    }
}
