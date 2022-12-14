package fr.the_gacha_company.projet_r304_gacha;

/**
 * Abstract representation of a Heroes and Monsters
 */
public abstract class Character implements Showable {

    private Stat stat;

    /**
     * Class constructor
     * @param stat
     */
    public Character(Stat stat) {
        this.stat = stat;
    }

    /**
     * Stat getter
     * @return this object's stat
     */
    public Stat getStat() {
        return stat;
    }

    /**
     * Reduces target hp depending on this object's attack and target's defense
     * @param target the targeted Character
     */
    public void attack(Character target) {
        target.stat.takeDamage(stat.getAttack() * (1-target.getStat().getDefense()));
    }

}
