package xz222bb_assign1.Ferry;

public class Bicycle extends Vehicle {
    public Bicycle() {
        super();
    }

    public Bicycle(int numberOfPassenger) throws RuntimeException{
        this.space = 0.2;
        this.price = 40;
        this.maximumPassenger = 1;
        this.numberOfPassenger = numberOfPassenger;
        if (numberOfPassenger == this.maximumPassenger) {
            Passenger p = new Passenger(this);
            this.passenger.add(p);
        }
        else
            throw new RuntimeException("Number of passenger on bicycle is 1");
    }
}
