package fr.the_gacha_company.projet_r304_gacha.heroes;

import fr.the_gacha_company.projet_r304_gacha.Stat;
import fr.the_gacha_company.projet_r304_gacha.heroes.races.PhysicalRace;
import fr.the_gacha_company.projet_r304_gacha.heroes.roles.PhysicalRole;

/**
 * the class that extends Hero and represent the PhysicalHero
 */
public class PhysicalHero extends Hero {
    /**
     * Constructor of PhysicalHero
     * @param name the name of the PhysicalHero
     * @param race the race of the PhysicalHero as a Race
     * @param role the role of the PhysicalHero as a Role
     * @param gender the gender of the PhysicalHero as a Gender
     * @param rarity the rarity of the PhysicalHero as a Rarity
     * @param lore the lore of the PhysicalHero
     * @param stat the stat of the PhysicalHero as a Stat
     */
    public PhysicalHero(String name, PhysicalRace race, PhysicalRole role, Gender gender, Rarity rarity, String lore, Stat stat) {
        super(name, race, role, gender, rarity, lore, stat);
    }
}
