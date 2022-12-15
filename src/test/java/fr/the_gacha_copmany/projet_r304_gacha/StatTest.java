package fr.the_gacha_copmany.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.Stat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatTest {

    @Test
    void testConstructor() {
        Stat stat = new Stat(0, 0, 0, 0);
        assertEquals(Stat.class, stat.getClass());
    }

    @Test
    void testGetter() {
        Stat stat = new Stat(20, 10, 0.3, 25);
        assertEquals(20, stat.getHpMax());
        assertEquals(20.0, stat.getHp());
        assertEquals(10, stat.getAttack());
        assertEquals(0.3, stat.getDefense());
        assertEquals(25, stat.getSpeed());
        assertTrue(stat.isFull());
        assertFalse(stat.isDead());
    }

    @Test
    void testBoost() {
        Stat stat = new Stat(20, 10, 0.3, 25);
        stat.boost(new Stat(10, 5, 0.1, -10));
        assertEquals(30, stat.getHpMax());
        assertEquals(30.0, stat.getHp());
        assertEquals(15, stat.getAttack());
        assertEquals(0.4, stat.getDefense());
        assertEquals(15, stat.getSpeed());
    }

    @Test
    void testIncrement() {
        Stat stat = new Stat(20, 10, 0.3, 25);
        stat.increment();
        assertEquals(21, stat.getHpMax());
        assertEquals(21.0, stat.getHp());
        assertEquals(11, stat.getAttack());
        assertEquals(0.31, stat.getDefense());
        assertEquals(26, stat.getSpeed());
    }

}
