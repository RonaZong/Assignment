package xz222bb_assign1.Ferry;

public class Lorry extends Vehicle {
    public Lorry() {
        super();
    }

    public Lorry(int numberOfPassenger) throws RuntimeException {
        this.space = 8;
        this.price = 200;
        this.maximumPassenger = 2;
        this.numberOfPassenger = numberOfPassenger;
        if (numberOfPassenger <= this.maximumPassenger) {
            for (int i = 0; i < numberOfPassenger; i++) {
                Passenger p = new Passenger(this);
                this.passenger.add(p);
            }
        }
        else
            throw new RuntimeException("Number of passenger on lorry is 1 ~ 2");
    }
}

