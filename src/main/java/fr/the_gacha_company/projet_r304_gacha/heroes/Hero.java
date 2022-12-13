package fr.the_gacha_company.projet_r304_gacha.heroes;

import fr.the_gacha_company.projet_r304_gacha.Character;
import fr.the_gacha_company.projet_r304_gacha.Main;
import fr.the_gacha_company.projet_r304_gacha.Stat;
import fr.the_gacha_company.projet_r304_gacha.heroes.races.MagicalRace;
import fr.the_gacha_company.projet_r304_gacha.heroes.races.PhysicalRace;
import fr.the_gacha_company.projet_r304_gacha.heroes.races.Race;
import fr.the_gacha_company.projet_r304_gacha.heroes.roles.MagicalRole;
import fr.the_gacha_company.projet_r304_gacha.heroes.roles.PhysicalRole;
import fr.the_gacha_company.projet_r304_gacha.heroes.roles.Role;

import java.util.HashSet;
import java.util.Set;

public abstract class Hero extends Character {

    public static Set<Hero> heroes = new HashSet<>(){{
        // COMMON
        add(new PhysicalHero("Godric", PhysicalRace.HUMAN, PhysicalRole.SWORDSMAN, Gender.MALE, Rarity.COMMON,
                "le lore", new Stat(45, 4, 0.25f, 15)));
        add(new PhysicalHero("Borld", PhysicalRace.ORC, PhysicalRole.WARRIOR, Gender.MALE, Rarity.COMMON,
                "le lore v2 xD", new Stat(35, 6, 0.2f, 20)));

        add(new MagicalHero("Snanar", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.FEMALE, Rarity.COMMON,
                "todo", new Stat(15, 7, 0.24f, 15)));

        // UNCOMMON
        add(new PhysicalHero("Thal", PhysicalRace.HUMAN, PhysicalRole.ARCHER, Gender.MALE, Rarity.UNCOMMON,
                "todo", new Stat(20, 12, 0.25f, 40)));
    }};
    private static final double total;

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
    private final Role role;
    private final Gender gender;
    private final Rarity rarity;
    private final String lore;
    private final double drop;

    private int level = 1;
    private int xp = 0;


    public Hero(String name, Race race, Role role, Gender gender, Rarity rarity, String lore, Stat stat) {
        super(stat);
        this.name = name;
        this.race = race;
        this.role = role;
        this.gender = gender;
        this.rarity = rarity;
        this.lore = lore;
        drop = 1 / (double) rarity.stars;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public Role getRole() {
        return role;
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

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public void levelUp() {
        ++level;
        xp = 0;
    }

    @Override
    public String minimalShow() {
        return name + " | " + race.getName() + " | " + role.getName() + " | " + gender + " | " + rarity + " | " +
                level + " | " + Math.round(getStat().getHp()) + '/' + getStat().getHp_max() + " | " +
                getStat().getAttack() + " | " + getStat().getDefense() + " | " + getStat().getSpeed();
    }

    @Override
    public String show() {
        return null;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", rarity=" + rarity +
                ", gender=" + gender +
                ", lore='" + lore + '\'' +
                '}';
    }

}
