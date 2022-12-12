package fr.the_gacha_company.projet_r304_gacha.heroes.races;

import fr.the_gacha_company.projet_r304_gacha.Stat;

public class PhysicalRace extends Race {

    public static final PhysicalRace HUMAN = new PhysicalRace("Humain", new Stat(0, 0, 0, 0));
    public static final PhysicalRace ORC = new PhysicalRace("Orc", new Stat(20, 2, 0.2f, -5));

    private PhysicalRace(String name, Stat boost) {
        super(name, boost);
    }

}
