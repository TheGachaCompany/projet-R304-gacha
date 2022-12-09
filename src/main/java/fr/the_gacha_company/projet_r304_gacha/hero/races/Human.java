package fr.the_gacha_company.projet_r304_gacha.hero.races;

import fr.the_gacha_company.projet_r304_gacha.hero.Gender;
import fr.the_gacha_company.projet_r304_gacha.hero.Hero;
import fr.the_gacha_company.projet_r304_gacha.hero.Rarity;
import fr.the_gacha_company.projet_r304_gacha.hero.Stat;

public abstract class Human extends Hero {

    public Human(String name, Rarity rarity, Gender gender, String lore, Stat stat) {
        super(name, rarity, gender, lore, stat);
    }

}
