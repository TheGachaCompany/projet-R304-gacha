package fr.the_gacha_company.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.hero.Hero;

import java.util.*;

public class Sort {

    public static Comparator<Hero> nom = (Hero h1, Hero h2) -> h1.getName().compareToIgnoreCase(h2.getName());

    public static Comparator<Hero> lvl = Comparator.comparingInt((Hero h) -> h.getStat().getLevel());

    public static Comparator<Hero> atk = Comparator.comparingDouble((Hero h) -> h.getStat().getAttack());





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
