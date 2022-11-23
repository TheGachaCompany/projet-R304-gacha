package fr.the_gacha_company.projet_r304_gacha;

public enum Rarity {

    COMMON(1),
    RARE(2),
    EPIC(3),
    LEGENDARY(4);

    public final int stars;

    private Rarity(int stars) {
        this.stars = stars;
    }

}
