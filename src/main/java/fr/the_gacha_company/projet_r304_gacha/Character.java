package fr.the_gacha_company.projet_r304_gacha;

public abstract class Character {

    private Stat stat;

    public Character(Stat stat) {
        this.stat = stat;
    }

    public Stat getStat() {
        return stat;
    }

    public void attack(Character target) {
        target.stat.takeDamage(stat.getAttack() * (1-target.getStat().getDefense()));
    }

}
