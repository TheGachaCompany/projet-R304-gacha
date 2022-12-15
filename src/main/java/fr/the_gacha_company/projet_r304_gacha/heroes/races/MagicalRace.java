package fr.the_gacha_company.projet_r304_gacha.heroes.races;

import fr.the_gacha_company.projet_r304_gacha.Stat;

/**
 * Class that extend Race and implement the Races that relate with magic
 */
public class MagicalRace extends Race {

    public static final MagicalRace ELF = new MagicalRace("Elfe", new Stat(-5, 0, 0, 5));

    /**
     * The constructor of MagicalRace
     * @param name the name of the MagicalRace
     * @param boost the boost of the MagicalRace as a Stat
     */
    private MagicalRace(String name, Stat boost) {
        super(name, boost);
    }

}
