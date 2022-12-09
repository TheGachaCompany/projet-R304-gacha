package fr.the_gacha_company.projet_r304_gacha.hero.heroes;

import fr.the_gacha_company.projet_r304_gacha.hero.Gender;
import fr.the_gacha_company.projet_r304_gacha.hero.Rarity;
import fr.the_gacha_company.projet_r304_gacha.hero.Stat;
import fr.the_gacha_company.projet_r304_gacha.hero.races.Human;

public class Godric extends Human {

    public static final Godric instance = new Godric();

    private Godric() {
        super(
            "Godric",
            Rarity.COMMON,
            Gender.MALE,
            "Godric, dit le puissant-chevalier est un chevalier fanatique de l'Ordre",
            new Stat(45, 4, 0.25, 15)
        );
    }

}
