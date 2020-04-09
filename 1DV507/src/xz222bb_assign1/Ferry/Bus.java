package xz222bb_assign1.Ferry;

public class Bus extends Vehicle {
    public Bus() {
        super();
    }

    public Bus(int numberOfPassenger) throws RuntimeException {
        this.space  = 4;
        this.price = 200;
        this.maximumPassenger = 20;
        this.numberOfPassenger = numberOfPassenger;
        if (numberOfPassenger <= this.maximumPassenger) {
            for (int i = 0; i < numberOfPassenger; i++) {
                Passenger p = new Passenger(this);
                this.passenger.add(p);
            }
        }
        else
            throw new RuntimeException("Number of passenger on bus is 1 ~ 20");
    }

}