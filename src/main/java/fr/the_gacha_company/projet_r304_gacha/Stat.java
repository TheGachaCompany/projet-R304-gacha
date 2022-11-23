package fr.the_gacha_company.projet_r304_gacha;

public class Stat {

    private final Rarity rarity;
    private final Gender gender;

    private int level = 0;
    private int hp_max;
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private int xp = 0;

    public Stat(Rarity rarity, Gender gender, int hp_max, int attack, int defense, int speed) {
        this.rarity = rarity;
        this.gender = gender;

        this.hp_max = hp_max;
        this.hp = hp_max;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public Gender getGender() {
        return gender;
    }

    public int getLevel() {
        return level;
    }

    public int getHp_max() {
        return hp_max;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getXp() {
        return xp;
    }

    @Override
    public String toString() {
        return "Stat{" +
                "rarity=" + rarity +
                ", gender=" + gender +
                ", level=" + level +
                ", hp_max=" + hp_max +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", speed=" + speed +
                ", xp=" + xp +
                '}';
    }
}
