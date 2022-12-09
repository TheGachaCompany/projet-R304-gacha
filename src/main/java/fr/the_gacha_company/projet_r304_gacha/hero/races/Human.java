package fr.the_gacha_company.projet_r304_gacha.races;

import fr.the_gacha_company.projet_r304_gacha.Gender;
import fr.the_gacha_company.projet_r304_gacha.Hero;
import fr.the_gacha_company.projet_r304_gacha.Rarity;
import fr.the_gacha_company.projet_r304_gacha.Stat;

public abstract class Human extends Hero {

    public Human(String name, Rarity rarity, Gender gender, String lore, Stat stat) {
        super(name, rarity, gender, lore, stat);
    }

}
