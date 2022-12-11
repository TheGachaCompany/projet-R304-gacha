package fr.the_gacha_company.projet_r304_gacha.hero;

import fr.the_gacha_company.projet_r304_gacha.hero.races.MagicalRace;
import fr.the_gacha_company.projet_r304_gacha.hero.roles.MagicalRole;

public class MagicalHero extends Hero {

    public MagicalHero(String name, MagicalRace race, MagicalRole role, Gender gender, Rarity rarity, String lore, Stat stat) {
        super(name, race, role, gender, rarity, lore, stat);
    }
}
