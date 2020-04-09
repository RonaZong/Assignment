package xz222bb_assign3;

public class Weapon {
    private String name;
    private int damageOfHero = (int)(Math.random() * 4 + 2);
    private int powerOfWeapon = 3;
    private int damageTotalOfWeapon = 0;
    int damageOfEnemy = (int)(Math.random() * 14 + 1);

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamageOfHero() {
        return damageOfHero;
    }

    public void setDamageOfHero(int damageTotalOfHero) {
        this.damageOfHero = damageTotalOfHero;
    }

    public int getPowerOfWeapon() {
        return powerOfWeapon;
    }

    public void setPowerOfWeapon(int powerOfWeapon) {
        this.powerOfWeapon = powerOfWeapon;
    }

    public int getDamageTotalOfWeapon() {
        return damageTotalOfWeapon;
    }

    public void setDamageTotalOfWeapon(int damageTotalOfWeapon) {
        this.damageTotalOfWeapon = damageTotalOfWeapon;
    }

    public int getDamageOfEnemy() {
        return damageOfEnemy;
    }

    public void setDamageOfEnemy(int damageTotalOfEnemy) {
        this.damageOfEnemy = damageTotalOfEnemy;
    }
}