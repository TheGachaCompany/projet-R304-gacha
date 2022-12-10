package fr.the_gacha_company.projet_r304_gacha.hero;

public enum Race {

    HUMAN(new Stat(0, 0, 0, 0)),
    ORC(new Stat(20, 1.2, 1.2, 0.7)),
    ELF(new Stat(-10, 0, 0, 1.5));

    public final Stat boost;

    private Race(Stat boost) {
        this.boost = boost;
    }

}
