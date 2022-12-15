package fr.the_gacha_company.projet_r304_gacha.heroes.races;

import fr.the_gacha_company.projet_r304_gacha.Stat;

/**
 *  Class that extend Race and implement the Races that relate with physical things
 */
public class PhysicalRace extends Race {
    /**
     * The static instance of the PhysicalRace HUMAN
     */
    public static final PhysicalRace HUMAN = new PhysicalRace("Humain", new Stat(0, 0, 0, 0));

    /**
     * The static instance of the Physical ORC
     */
    public static final PhysicalRace ORC = new PhysicalRace("Orc", new Stat(15, 2, 0.15, -5));

    /**
     * Constructor of PhysicalRace
     * @param name The name of the PhysicalRace
     * @param boost The boost that the PhysicalRace will benefit as a Stat
     */
    private PhysicalRace(String name, Stat boost) {
        super(name, boost);
    }

}
