package fr.the_gacha_company.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.hero.Hero;

import java.util.*;

public class Sort {

    public static Comparator<Hero> nom = (Hero h1, Hero h2) -> h1.getName().compareToIgnoreCase(h2.getName());

    public static Comparator<Hero> rarity = Comparator.comparingInt((Hero h) -> h.getRarity().stars);

    public static Comparator<Hero> lvl = Comparator.comparingInt((Hero h) -> h.getStat().getLevel());

    public static Comparator<Hero> atk = Comparator.comparingDouble((Hero h) -> h.getStat().getAttack());

    public static Comparator<Hero> def = Comparator.comparingDouble((Hero h) -> h.getStat().getDefense());

    public static Comparator<Hero> speed = Comparator.comparingDouble((Hero h) -> h.getStat().getSpeed());

    public static Comparator<Hero> hp = Comparator.comparingInt((Hero h) -> h.getStat().getHp_max());

    
    public static void sortByLambda(Set<Hero> aSet,Comparator<Hero> comparator){
        List<Hero> aList = new ArrayList<>(aSet);
        int left = 0;
        int right = 1;
        int i = aList.size();
        while ( i >= 1) {
            while (right < i) {
                if (comparator.compare(aList.get(left),aList.get(right))==1) {
                    Collections.swap(aList, left, right);
                }
                ++left;
                ++right;
            }
            --i;
        }
    }


}
