package xz222bb_assign1.Ferry;

import java.util.ArrayList;

public abstract class Vehicle {
    protected double space; // max space for each vehicle
    protected int price; // price for vehicle, does not include passenger fee
    protected int maximumPassenger; // max number of passenger in vehicle
    protected int numberOfPassenger;
    protected ArrayList<Passenger> passenger = new ArrayList<>();

    public Vehicle() {
        super();
    }

    public double getSpace() {
        return space;
    }

    public void setSpace(double space) {
        this.space = space;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public ArrayList<Passenger> getPassenger() {
        return passenger;
    }

    public void setPassengers(ArrayList<Passenger> passenger) {
        this.passenger = passenger;
    }
}
