package fr.the_gacha_company.projet_r304_gacha;

public abstract class Stat {

    private final Rarity rarity;
    private final String nom;
    private final Gender gender;

    private int level;
    private int hp_max;
    private int hp;
    private int attack;
    private int defense;
    private int speed;

    public Stat(Rarity rarity, String nom, Gender gender, int level, int hp_max, int attack, int defense, int speed) {
        this.rarity = rarity;
        this.nom = nom;
        this.gender = gender;

        this.level = level;
        this.hp_max = hp_max;
        this.hp = hp_max;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public String getNom() {
        return nom;
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

    @Override
    public String toString() {
        return "Stat{" +
                "rarity=" + rarity +
                ", nom='" + nom + '\'' +
                '}';
    }

}
