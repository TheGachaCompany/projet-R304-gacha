package fr.the_gacha_company.projet_r304_gacha.heroes;

import fr.the_gacha_company.projet_r304_gacha.Stat;
import fr.the_gacha_company.projet_r304_gacha.heroes.races.MagicalRace;
import fr.the_gacha_company.projet_r304_gacha.heroes.roles.MagicalRole;

/**
 * the class that extends Hero and represent the MagicalHero
 */
public class MagicalHero extends Hero {

    /**
     * Constructor of MagicalHero
     * @param name the name of the MagicalHero
     * @param race the race of the MagicalHero as a Race
     * @param role the role of the MagicalHero as a Role
     * @param gender the gender of the MagicalHero as a Gender
     * @param rarity the rarity of the MagicalHero as a Rarity
     * @param lore the lore of the MagicalHero
     * @param stat the stat of the MagicalHero as a Stat
     */
    public MagicalHero(String name, MagicalRace race, MagicalRole role, Gender gender, Rarity rarity, String lore, Stat stat) {
        super(name, race, role, gender, rarity, lore, stat);
    }

}
