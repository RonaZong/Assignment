package xz222bb_assign3;

public class Enemy {
    private String name;
    private int XP;

    public Enemy(String name, int XP) {
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
