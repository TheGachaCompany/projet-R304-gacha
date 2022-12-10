package fr.the_gacha_company.projet_r304_gacha.hero;

import fr.the_gacha_company.projet_r304_gacha.Main;

import java.util.HashSet;
import java.util.Set;

public class Hero {

    public static Set<Hero> heroes = new HashSet<>(){{
        add(new Hero("Godric", Race.HUMAN, Gender.MALE, Rarity.COMMON, "le lore", new Stat(120, 10, 10, 10)));
    }};
    public static final double total;

    static {
        double temp = 0;
        for (Hero h: heroes) temp += h.drop;
        total = temp;
    }

    public static Hero get_random_hero() {
        double x = Main.rand.nextDouble(total);
        double y = 0;
        for (Hero h: heroes) {
            y += h.drop;
            if (x<y) return h;
        }
        throw new RuntimeException("It's dangerous to go alone, take this.");
    }


    private final String name;
    private final Race race;
    private final Gender gender;
    private final Rarity rarity;
    private final String lore;
    private final Stat stat;
    private final double drop;


    public Hero(String name, Race race, Gender gender, Rarity rarity, String lore, Stat stat) {
        this.name = name;
        this.race = race;
        this.gender = gender;
        this.rarity = rarity;
        this.lore = lore;
        this.stat = stat;
        drop = 1 / (double) rarity.stars;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public Gender getGender() {
        return gender;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public String getLore() {
        return lore;
    }

    public Stat getStat() {
        return stat;
    }

    public double getDrop() {
        return drop;
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
