package xz222bb_assign1.Ferry;

public class Car extends Vehicle{
    public Car() {
        super();
    }

    public Car(int numberOfPassenger) throws RuntimeException {
        this.space = 1;
        this.price = 100;
        this.maximumPassenger = 4;
        this.numberOfPassenger = numberOfPassenger;
        if (numberOfPassenger <= this.maximumPassenger) {
            for (int i = 0; i < numberOfPassenger; i++) {
                Passenger p = new Passenger(this);
                this.passenger.add(p);
            }
        }
        else
            throw new RuntimeException("Number of passenger on car is 1 ~ 4");
    }
}

