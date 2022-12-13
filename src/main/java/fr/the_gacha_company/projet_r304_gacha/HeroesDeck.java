package fr.the_gacha_company.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.heroes.Hero;

import java.util.*;

public class HeroesDeck extends ArrayList<Hero> implements Showable {

    public static final Comparator<Hero> BY_NAME = (Hero h1, Hero h2) -> h1.getName().compareToIgnoreCase(h2.getName());
    public static final Comparator<Hero> BY_RARITY = Comparator.comparingInt((Hero h) -> h.getRarity().stars);
    public static final Comparator<Hero> BY_LEVEL = Comparator.comparingInt(Hero::getLevel);
    public static final Comparator<Hero> BY_HP_MAX = Comparator.comparingInt((Hero h) -> h.getStat().getHp_max());
    public static final Comparator<Hero> BY_ATTACK = Comparator.comparingDouble((Hero h) -> h.getStat().getAttack());
    public static final Comparator<Hero> BY_DEFENSE = Comparator.comparingDouble((Hero h) -> h.getStat().getDefense());
    public static final Comparator<Hero> BY_SPEED = Comparator.comparingDouble((Hero h) -> h.getStat().getSpeed());

    private void sortList(Comparator<Hero> comparator) {
        if (size() <= 1) return;
        int left=0, right=1, i=size();
        while (i >= 1) {
            while (right < i) {
                if (comparator.compare(get(left), get(right)) > 0)
                    Collections.swap(this, left, right);
                ++left;
                ++right;
            }
            --i;
        }
    }

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
        sortList(BY_NAME);
        StringBuilder sb = new StringBuilder("N | NOM | RACE | CLASSE | GENRE | RARETE | LVL | HP | ATK | DEF | VIT\n");
        for (int i=0; i<size(); ++i)
            sb.append(i).append(" | ").append(get(i).minimalShow()).append('\n');
        return sb.toString();
    }

}
