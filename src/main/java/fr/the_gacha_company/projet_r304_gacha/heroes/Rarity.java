package fr.the_gacha_company.projet_r304_gacha.heroes;

/**
 * The enum that represent the rarity of a Hero
 */
public enum Rarity {
    /**
     * The instance of the rarity COMMON
     */
    COMMON("Commun", 1),
    /**
     * The instance of the rarity UNCOMMON
     */
    UNCOMMON("Peu commun", 2),
    /**
     * The instance of the rarity RARE
     */
    RARE("Rare", 3),
    /**
     * The instance of the rarity EPIC
     */
    EPIC("Epic", 4),
    /**
     * The instance of the rarity LEGENDARY
     */
    LEGENDARY("Légendaire", 5);

    public final String name;
    public final int stars;
    public final double lootChance;

    /**
     * The constructor of Rarity
     * @param name the name of rarity
     * @param stars the number of the stars
     */
    Rarity(String name, int stars) {
        this.name = name;
        this.stars = stars;
        lootChance = 1.0/stars;
    }

}
