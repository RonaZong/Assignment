package xz222bb_assign1.Ferry;

import java.util.ArrayList;

public class FerryClass implements Ferry {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private ArrayList<Passenger> passengers = new ArrayList<>();

    private int currentPassengers = 0;
    private int currentMoney = 0;
    private double currentVehicleSpace = 0; // Used space for Vehicle
    private int currentPassengerSpace = 0; // Used space for Passenger
    private final double VEHICLE_SPACE = 40.00;
    private final int PASSENGER_SPACE = 200;

    @Override
    public int countPassengers() {
        return this.currentPassengers;
    }

    @Override
    public int countVehicleSpace() {
        return (int)(Math.round(this.currentVehicleSpace));
    }

    @Override
    public int countMoney() {
        for (Vehicle v : vehicles) {
            this.currentMoney += v.getPrice();
        }

        for (Passenger p : passengers) {
            this.currentMoney += p.getPrice();
        }

        return this.currentMoney;
    }

    @Override
    public Vehicle[] getAllVehicles() {
        Vehicle[] vehicleArray = new Vehicle[vehicles.size()];
        if (currentVehicleSpace == 0) {
            return null;
        }
        else {
            for (int i = 0; i < vehicles.size(); i++) {
                vehicleArray[i] = vehicles.get(i);
                System.out.println(vehicleArray[i]);
            }
            return vehicleArray;
        }
    }

    @Override
    public void embark(Vehicle v) {
        if (vehicles.contains(v)) {
            throw new RuntimeException("This vehicle has been on the ferry");
        }
        else {
            if (hasSpaceFor(v)) {
                if (v.numberOfPassenger <= PASSENGER_SPACE - currentPassengerSpace) {
                    this.currentVehicleSpace += v.space;
                    this.currentPassengerSpace += v.numberOfPassenger;
                    this.currentPassengers += v.passenger.size();
                    this.vehicles.add(v);
                    this.passengers.addAll(v.getPassenger());
                } else
                    throw new RuntimeException("No space for passengers");
            } else {
                throw new RuntimeException("No space for vehicle");
            }
        }
    }

    @Override
    public void embark(Passenger p) {
        if (hasRoomFor(p)) {
            this.currentPassengerSpace++;
            this.currentPassengers++;
            this.passengers.add(p);
        } else {
            throw new RuntimeException("No space for passenger");
        }
    }

    @Override
    public void disembark() {
        this.currentPassengers = 0;
        this.currentMoney = 0;
        this.currentVehicleSpace = 0;
        this.currentPassengerSpace = 0;
        vehicles.clear();
        passengers.clear();
    }

    @Override
    public boolean hasSpaceFor(Vehicle v) {
        return currentVehicleSpace + v.space <= VEHICLE_SPACE;
    }

    @Override
    public boolean hasRoomFor(Passenger p) {
        return currentPassengerSpace < PASSENGER_SPACE;
    }
}