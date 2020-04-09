package xz222bb_assign1.Ferry;

public class Passenger {
    private int price; // Passenger with vehicle
    private Vehicle vehicle;

    public Passenger() {
        setPrice(25);
    }

//    public Passenger(int numberOfPassenger) {
//        // Passenger with no vehicle
//        final int PRICE = 25;
//        setPrice(PRICE * numberOfPassenger);
//    }

    public Passenger(Vehicle vehicle) {
        this.vehicle = vehicle;
        setPrice();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getPrice() {
        return price;
    }

    private void setPrice(int price) {
        this.price = price;
    }

    public void setPrice() {
        if (vehicle instanceof Bicycle) {
            this.price = 0;
        }
        else if (vehicle instanceof Car) {
            this.price = 20;
        }
        else if (vehicle instanceof Bus) {
            this.price = 15;
        }
        else if (vehicle instanceof Lorry) {
            this.price = 20;
        }
    }
}
