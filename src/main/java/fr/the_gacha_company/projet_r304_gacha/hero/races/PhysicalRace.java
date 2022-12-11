package fr.the_gacha_company.projet_r304_gacha.hero.races;

import fr.the_gacha_company.projet_r304_gacha.hero.Stat;

import java.util.HashMap;
import java.util.Map;

public class PhysicalRace extends Race {

    public static final PhysicalRace HUMAN = new PhysicalRace("Humain", new Stat(0, 0, 0, 0));
    public static final PhysicalRace ORC = new PhysicalRace("Orc", new Stat(20, 0.2, 0.2, -0.2));

    private PhysicalRace(String name, Stat boost) {
        super(name, boost);
    }

}
