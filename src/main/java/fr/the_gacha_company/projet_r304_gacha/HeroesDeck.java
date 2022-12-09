package fr.the_gacha_company.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.hero.Hero;

import java.util.HashSet;

public class HeroesDeck extends HashSet<Hero> {

    @Override
    public boolean add(Hero hero) {
        if (!super.add(hero))
            // if hero is already unlocked
            hero.getStat().increment_level();
        return true;
    }
}
