package hero;

public class Arena {
    private static boolean hero1FirstAttacker;
    public static void fightRound(Hero hero1, Hero hero2) {
        if (hero1FirstAttacker) {
            hero2.attackEquipped(hero1);
            System.out.println(hero2.getName() + " has attacked " + hero1.getName() + " with " + hero2.getEquippedDamage()
            + " damage. " + hero1.getName() + " has " + hero1.getHealth() + " health left.");
            System.out.println("");
        } else {
            hero1.attackEquipped(hero2);
            System.out.println(hero1.getName() + " has attacked " + hero2.getName() + " with " + hero1.getEquippedDamage()
            + " damage. " + hero2.getName() + " has " + hero2.getHealth() + " health left.");
            System.out.println("");
        }
    }

    public static Hero fight(Hero hero1, Hero hero2) {
        double coinFlip = Math.random();

        //erste Rundenankündigung
        int round1 = 1;
        System.out.println("Round: " + round1);

        //coinFlip entscheidet ersten Angreifer
        if (coinFlip >= 0 && coinFlip < 0.5) {
            hero1FirstAttacker = true;
            hero1.attackEquipped(hero2);
            System.out.println(hero1.getName() + " has attacked " + hero2.getName() + " with " + hero1.getEquippedDamage()
            + " damage. " + hero2.getName() + " has " + hero2.getHealth() + " health left.");
            System.out.println("");
        } else {
            hero1FirstAttacker = false;
            hero2.attackEquipped(hero1);
            System.out.println(hero2.getName() + " has attacked " + hero1.getName() + " with " + hero2.getEquippedDamage()
            + " damage. " + hero1.getName() + " has " + hero1.getHealth() + " health left.");
            System.out.println("");
        }

        for (int round = 2; hero1.getHealth() >= 0 && hero2.getHealth() >= 0; round++) {
            //Rundenankündigung
            System.out.println("Round: " + round);

            fightRound(hero1, hero2);

            //Prüfen der Lebenspunkte
            if (hero1.getHealth() <= 0) {
                return hero2;
            }

            if (hero2.getHealth() <= 0) {
                return hero1;
            }
        } return null;
    }
}
