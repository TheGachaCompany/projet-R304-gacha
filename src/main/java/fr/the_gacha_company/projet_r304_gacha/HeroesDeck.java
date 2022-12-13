package fr.the_gacha_company.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.heroes.Hero;

import java.util.*;

public class HeroesDeck extends ArrayList<Hero> implements Showable {

    public static final Comparator<Hero> BY_NAME = (Hero h1, Hero h2) -> h1.getName().compareToIgnoreCase(h2.getName());
    public static final Comparator<Hero> BY_RARITY = Comparator.comparingInt((Hero h) -> h.getRarity().stars);
    public static final Comparator<Hero> BY_LEVEL = Comparator.comparingInt(Hero::getLevel);
    public static final Comparator<Hero> BY_HP_MAX = Comparator.comparingInt((Hero h) -> h.getStat().getHpMax());
    public static final Comparator<Hero> BY_ATTACK = Comparator.comparingDouble((Hero h) -> h.getStat().getAttack());
    public static final Comparator<Hero> BY_DEFENSE = Comparator.comparingDouble((Hero h) -> h.getStat().getDefense());
    public static final Comparator<Hero> BY_SPEED = Comparator.comparingDouble((Hero h) -> h.getStat().getSpeed());

    private void sortList(Comparator<Hero> comparator, boolean reversed) {
        // Bubble sort implementation
        if (size() < 2) return;
        int end = size();
        while (end >= 1) {
            int i = 0;
            while (i+1 < end) {
                if (comparator.compare(get(i), get(i+1)) * (reversed? -1: 1) > 0)
                    Collections.swap(this, i, i+1);
                ++i;
            }
            --end;
        }
    }

    @Override
    public boolean add(Hero hero) {
        if (contains(hero)) hero.levelUp();     // if hero is already unlocked
        else super.add(hero);
        return true;
    }

    @Override
    public String minimalShow() {
        return null;
    }

    @Override
    public String show() {
        return sortedShow(BY_RARITY, false);
    }

    public String sortedShow(Comparator<Hero> comp, boolean reversed) {
        sortList(comp, reversed);
        StringBuilder sb = new StringBuilder("N | NOM | RACE | CLASSE | GENRE | RARETE | LVL | HP | ATK | DEF | VIT\n");
        for (int i=0; i<size(); ++i) sb.append(i).append(" | ").append(get(i).minimalShow()).append('\n');
        return sb.toString();
    }

}
