package fr.the_gacha_company.projet_r304_gacha.heroes.races;

import fr.the_gacha_company.projet_r304_gacha.Stat;

/**
 * Abstract class that the race that only heroes can have
 */
public abstract class Race {

    private final String name;
    private final Stat boost;

    /**
     * Constructor of the class Race
     * @param name The name of the Race
     * @param boost The boost that the Race will benefit store as a Stat
     */
    public Race(String name, Stat boost) {
        this.name = name;
        this.boost = boost;
    }

    /**
     * Get the name of the Race
     * @return The name of the Race
     */
    public String getName() {
        return name;
    }

    /**
     * Get the boost that the Race benefit
     * @return The boost as a Stat
     */
    public Stat getBoost() {
        return boost;
    }

}
