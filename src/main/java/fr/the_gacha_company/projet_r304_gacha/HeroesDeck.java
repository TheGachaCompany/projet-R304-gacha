package fr.the_gacha_company.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.heroes.Hero;

import java.util.ArrayList;

public class HeroesDeck extends ArrayList<Hero> implements Showable {

    @Override
    public boolean add(Hero hero) {
        if (contains(hero))
            // if hero is already unlocked
            hero.levelUp();
        else
            super.add(hero);
        return true;
    }

    @Override
    public String minimalShow() {
        return null;
    }

    @Override
    public String show() {
        StringBuilder sb = new StringBuilder("N | NOM | RACE | CLASSE | GENRE | RARETE | LVL | HP | ATK | DEF | VIT\n");
        for (int i=0; i<size(); ++i)
            sb.append(i).append(" | ").append(get(i).minimalShow()).append('\n');
        return sb.toString();
    }

}
