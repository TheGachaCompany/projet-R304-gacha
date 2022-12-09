package fr.the_gacha_company.projet_r304_gacha.hero;

public class Stat {

    private int level;
    private int xp;
    private int hp_max;
    private int hp;
    private double attack;
    private double defense;
    private double speed;

    public Stat(int hp_max, double attack, double defense, double speed) {
        this.level = 0;
        this.xp = 0;
        this.hp_max = hp_max;
        this.hp = hp_max;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public int getHp_max() {
        return hp_max;
    }

    public int getHp() {
        return hp;
    }

    public double getAttack() {
        return attack;
    }

    public double getDefense() {
        return defense;
    }

    public double getSpeed() {
        return speed;
    }

    public void increment_level() {
        ++level;
        xp = 0;
    }

    @Override
    public String toString() {
        return "Stat{" +
                "level=" + level +
                ", hp_max=" + hp_max +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", speed=" + speed +
                ", xp=" + xp +
                '}';
    }

}
