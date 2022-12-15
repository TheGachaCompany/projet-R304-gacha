package fr.the_gacha_copmany.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.Global;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GlobalTest {

    @Test
    void centerStringBalancedShortSize() {
        assertEquals(" a ", Global.center("a", 3));
    }

    @Test
    void centerStringBalancedLongSize() {
        assertEquals("        b        ", Global.center("b", 17));
    }

    @Test
    void centerStringUnbalancedShortSize() {
        assertEquals(" c  ", Global.center("c", 4));
    }

    @Test
    void centerStringUnbalancedLongSize() {
        assertEquals("        d         ", Global.center("d", 18));
    }

    @Test
    void centerTooLongStringBalancedSize() {
        assertEquals("abcdefg", Global.center("abcdefg", 3));
    }

    @Test
    void centerShortStringBalancedLongSize() {
        assertEquals("abcdefg", Global.center("abcdefg", 4));
    }


}
