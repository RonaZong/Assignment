package xz222bb_assign3;

public class MoonsMain {
    public static void main(String[] args) {
        Planet mars = new Planet("Mars", 4, 2, 1.666, 1.382);
        Moon phobos = new Moon("Phobos",  0 );
        Moon deimos = new Moon("Deimos",  0 );

        mars.print();

        System.out.println("\nMoons of " + mars.getName() + ":");
        mars.addMoon(phobos);
        mars.addMoon(deimos);
    }
}
