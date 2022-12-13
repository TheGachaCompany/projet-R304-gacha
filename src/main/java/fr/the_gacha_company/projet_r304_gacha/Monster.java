package fr.the_gacha_company.projet_r304_gacha;

public class Monster extends Character {

    public static Monster createMonster() {
        return new Monster(new Stat(Main.rand.nextInt(15, 50), Main.rand.nextInt(3, 15),
                Main.rand.nextFloat(0.1f, 0.4f), Main.rand.nextInt(15, 35)));
    }

    private final int goldValue;

    private Monster(Stat stat) {
        super(stat);
        goldValue = Math.round((stat.getHp_max() + stat.getAttack() + stat.getSpeed()/3.0f) * (1+stat.getDefense()));
    }

    public int getGoldValue() {
        return goldValue;
    }

    @Override
    public String minimalShow() {
        return null;
    }

    @Override
    public String show() {
        String hp = getStat().getRoundedHp() + "/" + getStat().getHp_max();
        return String.format("""
                =========================
                |        MONSTRE        |
                | PV %18s |
                | Attaque %13d |
                | Défense %13f |
                | Vitesse %13d |
                | Récompense %5d gold |
                =========================""",
                hp, getStat().getAttack(), getStat().getDefense(), getStat().getSpeed(), goldValue);
    }
}
