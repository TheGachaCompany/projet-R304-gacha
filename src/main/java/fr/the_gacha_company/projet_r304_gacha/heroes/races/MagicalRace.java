package fr.the_gacha_company.projet_r304_gacha.heroes.races;

import fr.the_gacha_company.projet_r304_gacha.Stat;

public class MagicalRace extends Race {

    public static final MagicalRace ELF = new MagicalRace("Elfe", new Stat(-10, 0, 0, 2));

    private MagicalRace(String name, Stat boost) {
        super(name, boost);
    }

}
