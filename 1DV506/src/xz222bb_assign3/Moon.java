package xz222bb_assign3;

public class Moon {
    private String name;
    private int diameter;

    public Moon() {
    }

    public Moon(String name, int diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    public void print() {
        System.out.print("Largest moon is the solar system is " + name + " which is " + diameter + " km in diameter.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
