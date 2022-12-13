package fr.the_gacha_company.projet_r304_gacha.heroes.races;

import fr.the_gacha_company.projet_r304_gacha.Stat;

public class MagicalRace extends Race {

    public static final MagicalRace ELF = new MagicalRace("Elfe", new Stat(-5, 0, 0, 5));

    private MagicalRace(String name, Stat boost) {
        super(name, boost);
    }

}
