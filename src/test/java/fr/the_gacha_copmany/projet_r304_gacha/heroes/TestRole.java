package fr.the_gacha_copmany.projet_r304_gacha.heroes;

import fr.the_gacha_company.projet_r304_gacha.heroes.roles.MagicalRole;
import fr.the_gacha_company.projet_r304_gacha.heroes.roles.PhysicalRole;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRole {

    @Test
    void testEfficiency() {
        assertEquals(2, PhysicalRole.PALADIN.getEfficency(MagicalRole.MAGICIAN.getId()));
        assertEquals(0.8, PhysicalRole.BARBARIAN.getEfficency(PhysicalRole.BARBARIAN.getId()));
    }

}
