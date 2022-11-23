package fr.the_gacha_company.projet_r304_gacha;

public abstract class Hero extends Stat {

    private final String lore;

    private int xp = 0;

    public Hero(Rarity rarity, String nom, Gender gender, int hp_max, int attack, int defense, int speed, String lore) {
        super(rarity, nom, gender, hp_max, attack, defense, speed);
        this.lore = lore;
    }

    public String getLore() {
        return lore;
    }

    public int getXp() {
        return xp;
    }

    @Override
    public String toString() {
        return "Hero{" + super.toString() +
                ", xp=" + xp +
                "}";
    }

}
