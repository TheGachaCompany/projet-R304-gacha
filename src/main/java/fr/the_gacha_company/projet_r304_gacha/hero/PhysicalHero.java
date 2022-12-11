package fr.the_gacha_company.projet_r304_gacha.hero;

import fr.the_gacha_company.projet_r304_gacha.hero.races.PhysicalRace;
import fr.the_gacha_company.projet_r304_gacha.hero.roles.PhysicalRole;

public class PhysicalHero extends Hero {

    public PhysicalHero(String name, PhysicalRace race, PhysicalRole role, Gender gender, Rarity rarity, String lore, Stat stat) {
        super(name, race, role, gender, rarity, lore, stat);
    }
}
