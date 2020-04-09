package xz222bb_assign3;

public class StonePlanets {
    public static void main(String[] args) {
        Planet[] no = new Planet[4];
        no[0] = new Planet("Mercury", 0, 0, 0.47, 0.31);
        no[1] = new Planet("Venus", 0, 0, 0.72, 0.72);
        no[2] = new Planet("Earth", 0, 1, 1.0, 0.99);
        no[3]= new Planet("Mars", 4, 2, 1.666, 1.382);

        Moon moon = new Moon("The Moon", 0);
        no[2].addMoon(moon);

        Moon phobos = new Moon("Phobos", 0);
        Moon deimos = new Moon("Deimos", 0);
        no[3].addMoon(phobos);
        no[3].addMoon(deimos);

        for (int i = 0; i < no.length; i++) {
            System.out.println("Planet " + no[i].getName() + " has aphelion " + no[i].getAphelion() + " AU, perihelion " + no[i].getPerihelion() + " AU and " + no[i].getNoOfMoons() + " moons.");
            if (no[i].getNoOfMoons() != 0) {
                String[] moons = no[i].getMoons();
                for (int k = 0; k < moons.length; k++) {
                    System.out.println("\t" + moons[k]);
                }
            }
        }
    }
}
