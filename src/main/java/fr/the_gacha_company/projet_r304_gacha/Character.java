package fr.the_gacha_company.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.heroes.roles.Role;

/**
 * Abstract representation of a Heroes and Monsters
 */
public abstract class Character implements Showable {

    private Role role;
    private Stat stat;

    /**
     * Class constructor
     * @param stat
     */
    public Character(Role role, Stat stat) {
        this.role = role;
        this.stat = stat;
    }

    public Role getRole() {
        return role;
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
        target.stat.takeDamage(stat.getAttack() * (1-target.getStat().getDefense()) * role.getEfficency(target.role.getId()));
    }

}
