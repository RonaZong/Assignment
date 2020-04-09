package xz222bb_assign3;

public class Hero {
    private String name;
    private int XP;

    public Hero(String name, int XP) {
        this.name = name;
        this.XP = XP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXP() {
        return XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }
}
