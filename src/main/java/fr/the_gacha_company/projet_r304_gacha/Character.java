package fr.the_gacha_company.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.heroes.roles.Role;

public abstract class Character implements Showable {

    private Role role;
    private Stat stat;

    public Character(Role role, Stat stat) {
        this.role = role;
        this.stat = stat;
    }

    public Role getRole() {
        return role;
    }

    public Stat getStat() {
        return stat;
    }

    public void attack(Character target) {
        target.stat.takeDamage(stat.getAttack() * (1-target.getStat().getDefense()) * Role.efficency.get(role).get(target.role));
    }

}
