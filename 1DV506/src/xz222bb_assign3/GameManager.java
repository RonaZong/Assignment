package xz222bb_assign3;

public class GameManager {
    public static void main(String[] args) {
        Hero hero = new Hero("Lord Gurkan", 50);
        Enemy enemy = new Enemy("Prince Purjo", 30);

        Weapon weaponHero = new Weapon("Steel Sallad");
        Weapon weaponEnemy = new Weapon("his fists");

        System.out.println(hero.getName() + " has " + hero.getXP() + " and a " + weaponHero.getName() + " to fight with.");
        System.out.println(enemy.getName() + " has " + enemy.getXP() + " and uses " + weaponEnemy.getName() + " to fight with.");

        int noOfRound = 0;
        int H = hero.getXP();
        int E = enemy.getXP();

        while (E >= 0) {
            noOfRound++;
            System.out.println("\nRound " + noOfRound + ":");

            // Hero attacks, Enemy defences
            // Attack of Hero's weapon
            int attackH = 0;
            for (int noOfDice = 0; noOfDice < weaponHero.getPowerOfWeapon(); noOfDice++) {
                int damageSingleOfWeapon = (int) (Math.random() * 6 + 1);
                attackH += damageSingleOfWeapon;
            }

            // Defence of Enemy
            int defenceE = weaponEnemy.damageOfEnemy;

            if (defenceE >= attackH) {
                System.out.println(hero.getName() + " gives his all, but " + enemy.getName() + "dodges!");
            } else {
                E -= (attackH - defenceE);
                System.out.println(hero.getName() + " gives " + enemy.getName() + " a powerful blow!");
            }

            // Enemy attacks, Hero defences
            // Defence of Hero's weapon
            int defenceH = 0;
            for (int noOfDice = 0; noOfDice < weaponHero.getPowerOfWeapon(); noOfDice++) {
                int damageSingleOfWeapon = (int) (Math.random() * 6 + 1);
                defenceH += damageSingleOfWeapon;
            }

            // Attack of Enemy
            int attackE = weaponEnemy.damageOfEnemy;

            if (attackE >= defenceH) {
                System.out.println(enemy.getName() + " tries his best but " + hero.getName() + " dodges the blow!");
            } else {
                H -= (attackE - defenceH);
                System.out.println(enemy.getName() + " manages to hit " + hero.getName() + "\n" + hero.getName() + " is still well and kicking!");
            }
        }

        System.out.println(enemy.getName() + " is defeated!");
    }
}
