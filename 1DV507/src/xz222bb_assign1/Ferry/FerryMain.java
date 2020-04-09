package xz222bb_assign1.Ferry;

import java.util.Arrays;
import java.util.Scanner;

public class FerryMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many times for the ferry to cross the river? ");
        int n = 1;

        while (n != 0) {
            n = input.nextInt(); // Times for embark and disembark (together count as 1)

            for (int i = n; i > 0; i--) {
                FerryClass ferry = new FerryClass();
                System.out.print("How many bicycles are embarked? ");
                int numberOfBicycle = input.nextInt();
                System.out.print("How many cars are embarked? ");
                int numberOfCar = input.nextInt();
                System.out.print("How many buses are embarked? ");
                int numberOfBus = input.nextInt();
                System.out.print("How many lorries are embarked? ");
                int numberOfLorry = input.nextInt();
                System.out.print("How many passengers are embarked without vehicle? ");
                int numberOfPerson = input.nextInt();

                int num;
                for (num = 0; num < numberOfBicycle; num++) {
                    Bicycle bicycle = new Bicycle(1);
                    ferry.embark(bicycle);
                }

                for (num = 0; num < numberOfCar; num++) {
                    System.out.print("How many passengers in the number " + (num + 1) + " car?");
                    int c = input.nextInt();
                    Car car = new Car(c);
                    ferry.embark(car);
                }

                for (num = 0; num < numberOfBus; num++) {
                    System.out.print("How many passengers in the number " + (num + 1) + " bus?");
                    int b = input.nextInt();
                    Bus bus = new Bus(b);
                    ferry.embark(bus);
                }

                for (num = 0; num < numberOfLorry; num++) {
                    System.out.print("How many passengers in the number " + (num + 1) + " lorry?");
                    int l = input.nextInt();
                    Lorry lorry = new Lorry(l);
                    ferry.embark(lorry);
                }

                for (num = 0; num < numberOfPerson; num++) {
                    Passenger person = new Passenger();
                    ferry.embark(person);
                }

                System.out.println("The total number of passengers is: " + ferry.countPassengers());
                System.out.println("The total amount of money is: " + ferry.countMoney());
                System.out.println("The total space of vehicles is: " + ferry.countVehicleSpace());
                System.out.println(Arrays.toString(ferry.getAllVehicles()));
                ferry.disembark();
                System.out.println("Everything has disembarked");

                if (i == 1) {
                    System.exit(1);
                }
            }
        }
    }
}
