package fr.the_gacha_company.projet_r304_gacha.heroes;

public enum Rarity {

    COMMON("Commun", 1),
    UNCOMMON("Peu commun", 1),
    RARE("Rare", 1),
    EPIC("Epic", 1),
    LEGENDARY("Légendaire", 1);

    public final String name;
    public final int stars;

    Rarity(String name, int stars) {
        this.name = name;
        this.stars = stars;
    }

}
