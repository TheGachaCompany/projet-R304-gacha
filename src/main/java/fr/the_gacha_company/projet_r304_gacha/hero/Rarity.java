package fr.the_gacha_company.projet_r304_gacha.hero;

public enum Rarity {

    COMMON(1),
    UNCOMMON(2),
    RARE(3),
    EPIC(4),
    LEGENDARY(5);

    public final int stars;

    private Rarity(int stars) {
        this.stars = stars;
    }

}
