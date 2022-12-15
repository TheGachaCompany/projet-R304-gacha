package fr.the_gacha_company.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.heroes.roles.Role;

/**
 * The clas that extends Character and represent the monster
 */
public class Monster extends Character {
    /**
     * abstract methode that create a monster with procedural stat
     * @return a monster
     */
    public static Monster createMonster() {
        return new Monster(Role.getRandom(), new Stat(Global.rand.nextInt(15, 50), Global.rand.nextInt(3, 15),
                Math.round(Global.rand.nextDouble(0, 0.5)*100)/100.0, Global.rand.nextInt(15, 35)));
    }

    private final int coinsValue;
    private final int xpValue;

    /**
     * Constructor of Monter
     * @param role the role of Monster as a Tole
     * @param stat the stat of Monster as a Stat
     */
    private Monster(Role role, Stat stat) {
        super(role, stat);
        coinsValue = (int) Math.round((stat.getHpMax()+stat.getAttack()+stat.getSpeed()/3.0) * (1+stat.getDefense()));
        xpValue = coinsValue / 5;
    }

    /**
     * Get the coins value of the monster
     * @return the coins value
     */
    public int getCoinsValue() {
        return coinsValue;
    }

    /**
     * Get the Xp value of the monster
     * @return the xp value
     */
    public int getXpValue() {return xpValue;}

    /**
     * A methode that create a minimalShow string
     * @return null
     */
    @Override
    public String minimalShow() {
        return null;
    }

    /**
     * A methode that create a show string of the interface
     * @return a show string of the interface
     */
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
