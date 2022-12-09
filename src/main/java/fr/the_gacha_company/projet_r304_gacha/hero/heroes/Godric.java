package fr.the_gacha_company.projet_r304_gacha.heroes;

import fr.the_gacha_company.projet_r304_gacha.Gender;
import fr.the_gacha_company.projet_r304_gacha.Rarity;
import fr.the_gacha_company.projet_r304_gacha.Stat;
import fr.the_gacha_company.projet_r304_gacha.races.Human;

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
