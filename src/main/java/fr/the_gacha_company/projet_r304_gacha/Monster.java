package fr.the_gacha_company.projet_r304_gacha;

public class Monster extends Character {

    public static Monster createMonster() {
        return new Monster(new Stat(Global.rand.nextInt(15, 50), Global.rand.nextInt(3, 15),
                Math.round(Global.rand.nextDouble(0, 0.5)*100)/100.0, Global.rand.nextInt(15, 35)));
    }

    private final int goldValue;

    private Monster(Stat stat) {
        super(stat);
        goldValue = (int) Math.round((stat.getHpMax()+stat.getAttack()+stat.getSpeed()/3.0) * (1+stat.getDefense()));
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
        String hp = getStat().getRoundedHp() + "/" + getStat().getHpMax();
        return String.format("""
                =========================
                |        MONSTRE        |
                | PV %18s |
                | Attaque %13d |
                | Défense %12d%% |
                | Vitesse %13d |
                | Récompense %3d pièces |
                =========================""",
                hp, getStat().getAttack(), (int) (getStat().getDefense()*100), getStat().getSpeed(), goldValue);
    }

}
