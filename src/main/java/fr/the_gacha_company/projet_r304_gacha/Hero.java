package fr.the_gacha_company.projet_r304_gacha;

public abstract class Hero {

    private final String name;
    private final String lore;
    private final Stat stat;


    public Hero(String name, String lore, Rarity rarity, Gender gender, int hp_max, int attack, int defense, int speed) {
        this.name = name;
        this.lore = lore;
        this.stat = new Stat(rarity, gender, hp_max, attack, defense, speed);
    }

    public String getName() {
        return name;
    }

    public String getLore() {
        return lore;
    }

    public Stat getState() {
        return stat;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name=" + name +
                ", lore=" + lore +
                ", " + super.toString() +
                "}";
    }

}
