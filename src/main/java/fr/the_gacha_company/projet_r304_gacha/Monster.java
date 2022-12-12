package fr.the_gacha_company.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.hero.Stat;

public class Monster {

    public static Monster createMonster() {
        return new Monster(new Stat(Main.rand.nextInt(15, 50), Main.rand.nextDouble(4, 15),
                Main.rand.nextDouble(0.1, 0.4), Main.rand.nextDouble(15, 40)));
    }

    private final Stat stat;

    private Monster(Stat stat) {
        this.stat = stat;
    }

    public Stat getStat() {
        return stat;
    }
}
