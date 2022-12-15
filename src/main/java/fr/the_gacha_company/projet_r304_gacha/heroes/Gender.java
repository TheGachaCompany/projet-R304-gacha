package fr.the_gacha_company.projet_r304_gacha.heroes;

/**
 * The enum that give the gender values
 */
public enum Gender {
    /**
     * The Instance of Gender that represent MALE
     */
    MALE("Homme"),

    /**
     * The Instance of Gender that represent FEMALE
     */
    FEMALE("Femme");

    public final String name;

    /**
     * The constructor of Gender
     * @param name the name of the gender
     */
    Gender(String name) {
        this.name = name;
    }

}
