package fr.the_gacha_company.projet_r304_gacha;

public abstract class Stat {

    private final Rarity rarity;
    private final String nom;
    private final Gender gender;

    private int level;
    private int hp;
    private int hp_max;
    private int attack;
    private int defense;
    private int speed;

    public Stat(Rarity rarity, String nom, Gender gender) {
        this.rarity = rarity;
        this.nom = nom;
        this.gender = gender;
    }

}
