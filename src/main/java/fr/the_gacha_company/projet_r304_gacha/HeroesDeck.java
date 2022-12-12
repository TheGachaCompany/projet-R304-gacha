package fr.the_gacha_company.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.hero.Hero;

import java.util.ArrayList;

public class HeroesDeck extends ArrayList<Hero> {

    @Override
    public boolean add(Hero hero) {
        if (!contains(hero))
            // if hero is already unlocked
            hero.getStat().increment_level();
        else
            super.add(hero);
        return true;
    }

}
