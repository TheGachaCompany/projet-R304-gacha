package fr.the_gacha_company.projet_r304_gacha;

public class Monster extends Character {

    public static Monster createMonster() {
        return new Monster(new Stat(Main.rand.nextInt(15, 50), Main.rand.nextInt(4, 15),
                Main.rand.nextFloat(0.1f, 0.4f), Main.rand.nextInt(15, 40)));
    }

    private final int goldValue;

    private Monster(Stat stat) {
        super(stat);
        goldValue = Math.round((stat.getHp_max() + stat.getAttack() + stat.getSpeed()) * (1+stat.getDefense()));
    }

    public int getGoldValue() {
        return goldValue;
    }

}
