package xz222bb_assign3;

import java.util.ArrayList;

public class Planet {
    private String name = "Unknown planet";
    private int positionFromSun;
    private int noOfMoons;
    private double aphelion;
    private double perihelion;
    private ArrayList<Moon> moons = new ArrayList<Moon>();

    public Planet() {
    }

    public Planet(String name, int positionFromSun, int noOfMoons, double aphelion, double perihelion) {
        this.name = name;
        checkName(name);

        this.positionFromSun = positionFromSun;
        checkPositionFromSun(positionFromSun);

        this.noOfMoons = noOfMoons;
        checkNoOfMoons(noOfMoons);

        this.aphelion = aphelion;
        checkAphelion(aphelion);

        this.perihelion = perihelion;
        checkPerihelion(perihelion);
    }

    public void print() {
        System.out.printf("%s:\n\t Position:\t%d\n\t Moons:\t\t%d\n\t Aphelion:\t%1.3f\n\t Perihelion:%1.3f\n\t ", this.name, this.positionFromSun, this.noOfMoons, this.aphelion, this.perihelion);
    }

    private void checkName(String name) {
        if (name.isEmpty()) {
            this.name = "Unknown planet";
        }
    }

    private void checkPositionFromSun(int positionFromSun) {
        if (!(positionFromSun >= 1 && positionFromSun <= 9))
            this.positionFromSun = 0;
    }

    private void checkNoOfMoons(int noOfMoons) {
        if (!(noOfMoons >= 0 && positionFromSun <= 100))
            this.noOfMoons = 0;
    }

    private void checkAphelion(double aphelion) {
        if (!(aphelion >= 0 && positionFromSun <= 50))
            this.aphelion = 0;
    }

    private void checkPerihelion(double perihelion) {
        if (!(perihelion >= 0 && perihelion <= 30))
            this.perihelion = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        checkName(name);
    }

    public int getPositionFromSun() {
        return positionFromSun;
    }

    public void setPositionFromSun(int positionFromSun) {
        this.positionFromSun = positionFromSun;
        checkPositionFromSun(positionFromSun);
    }

    public int getNoOfMoons() {
        return noOfMoons;
    }

    public void setNoOfMoons(int noOfMoons) {
        this.noOfMoons = noOfMoons;
        checkNoOfMoons(noOfMoons);
    }

    public double getAphelion() {
        return aphelion;
    }

    public void setAphelion(double aphelion) {
        this.aphelion = aphelion;
        checkAphelion(aphelion);
    }

    public double getPerihelion() {
        return perihelion;
    }

    public void setPerihelion(double perihelion) {
        this.perihelion = perihelion;
        checkPerihelion(perihelion);
    }


    // Changes for Moon
    public void addMoon(Moon moons) {
        this.moons.add(moons);
    }

//    public String[] getMoons(){
//        String[] Moon = new String[noOfMoons];
//        for (int i = 0; i < moons.size(); i++){
//            Moon[i] = moons.get(i).getName();
//        }
//        return Moon;
//    }

    public String[] getMoons() {
        String[] moon = new String[noOfMoons];
        for (int i = 0; i < moon.length; i++) {
            moon[i] = moons.get(i).getName();
        }
        return moon;
    }
}

