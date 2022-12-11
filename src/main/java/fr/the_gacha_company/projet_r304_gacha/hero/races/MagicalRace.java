package fr.the_gacha_company.projet_r304_gacha.hero.races;

import fr.the_gacha_company.projet_r304_gacha.hero.Stat;

import java.util.Map;
import java.util.HashMap;

public class MagicalRace extends Race {

    public enum MagicalRaceName {
        ELF
    }

    private static final Map<MagicalRaceName, MagicalRace> races = new HashMap<>(){{
        put(MagicalRaceName.ELF, new MagicalRace(MagicalRaceName.ELF.toString(),
                new Stat(-10, 0, 0, 0.2)));
    }};

    public static MagicalRace get(MagicalRaceName name) {
        return races.get(name);
    }

    private MagicalRace(String name, Stat boost) {
        super(name, boost);
    }

}
