package fr.the_gacha_company.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.heroes.roles.Role;

public class Monster extends Character {

    public static Monster createMonster() {
        return new Monster(Role.getRandom(), new Stat(Global.rand.nextInt(15, 50), Global.rand.nextInt(3, 15),
                Math.round(Global.rand.nextDouble(0, 0.5)*100)/100.0, Global.rand.nextInt(15, 35)));
    }

    private final int coinsValue;
    private final int xpValue;

    private Monster(Role role, Stat stat) {
        super(role, stat);
        coinsValue = (int) Math.round((stat.getHpMax()+stat.getAttack()+stat.getSpeed()/3.0) * (1+stat.getDefense()));
        xpValue = coinsValue / 5;
    }

    public int getCoinsValue() {
        return coinsValue;
    }

    public int getXpValue() {return xpValue;}

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
                | Classe %14s |
                | PV %18s |
                | Attaque %13d |
                | Défense %12d%% |
                | Vitesse %13d |
                | Récompense %3d pièces |
                | Récompense %6d exp |
                =========================""",
                getRole().getName(), hp, getStat().getAttack(), (int) (getStat().getDefense()*100),
                getStat().getSpeed(), coinsValue, xpValue);
    }

}
