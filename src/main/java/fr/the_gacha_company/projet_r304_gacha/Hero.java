package fr.the_gacha_company.projet_r304_gacha;

public abstract class Hero {

    private final String name;
    private final Rarity rarity;
    private final Gender gender;
    private final String lore;
    private final Stat stat;


    public Hero(String name, Rarity rarity, Gender gender, String lore, Stat stat) {
        this.name = name;
        this.rarity = rarity;
        this.gender = gender;
        this.lore = lore;
        this.stat = stat;
    }

    public String getName() {
        return name;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public Gender getGender() {
        return gender;
    }

    public String getLore() {
        return lore;
    }

    public Stat getStat() {
        return stat;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", rarity=" + rarity +
                ", gender=" + gender +
                ", lore='" + lore + '\'' +
                ", stat=" + stat +
                '}';
    }

}
