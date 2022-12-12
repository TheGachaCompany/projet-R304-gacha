package fr.the_gacha_company.projet_r304_gacha.heroes.races;

import fr.the_gacha_company.projet_r304_gacha.Stat;

public abstract class Race {

    private final String name;
    private final Stat boost;

    public Race(String name, Stat boost) {
        this.name = name;
        this.boost = boost;
    }

    public String getName() {
        return name;
    }

    public Stat getBoost() {
        return boost;
    }

}
