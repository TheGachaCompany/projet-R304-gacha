package fr.the_gacha_copmany.projet_r304_gacha.heroes;

import fr.the_gacha_company.projet_r304_gacha.heroes.Rarity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRarity {

    @Test
    void testCommonChance() {
        assertEquals(1.0, Rarity.COMMON.lootChance);
    }

    @Test
    void testUncommonChance() {
        assertEquals(0.5, Rarity.UNCOMMON.lootChance);
    }

    @Test
    void testRareChance() {
        assertEquals(1/3.0, Rarity.RARE.lootChance);
    }

    @Test
    void testEpicChance() {
        assertEquals(0.25, Rarity.EPIC.lootChance);
    }

    @Test
    void testLegendaryChance() {
        assertEquals(0.2, Rarity.LEGENDARY.lootChance);
    }

}
