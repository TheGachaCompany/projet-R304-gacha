package fr.the_gacha_company.projet_r304_gacha.hero.races;

import fr.the_gacha_company.projet_r304_gacha.hero.Stat;

import java.util.HashMap;
import java.util.Map;

public class PhysicalRace extends Race {

    public enum PhysicalRaceName {
        HUMAN, ORC
    }

    private static final Map<PhysicalRaceName, PhysicalRace> races = new HashMap<>(){{
        put(PhysicalRaceName.HUMAN, new PhysicalRace(PhysicalRaceName.HUMAN.toString(),
                new Stat(0, 0, 0, 0)));
        put(PhysicalRaceName.ORC, new PhysicalRace(PhysicalRaceName.ORC.toString(),
                new Stat(20, 0.2, 0.2, -0.2)));
    }};

    public static PhysicalRace get(PhysicalRaceName name) {
        return races.get(name);
    }

    private PhysicalRace(String name, Stat boost) {
        super(name, boost);
    }

}
