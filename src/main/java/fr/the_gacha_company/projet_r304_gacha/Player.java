package fr.the_gacha_company.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.heroes.Hero;

public class Player {

    public static final String INSTRUCTIONS = """
            1. Acheter un héros
            2. Mes héros
            3. Combattre
            4. Quitter le jeu""";
    public static final int HERO_COST = 200;

    private static int fight(Hero hero, Monster monster) {
        if (monster.getStat().getSpeed()>hero.getStat().getSpeed())
            monster.attack(hero);
        while (true) {
            if (hero.getStat().isDead()) return -1;
            hero.attack(monster);
            if (monster.getStat().isDead()) return monster.getGoldValue();
            monster.attack(hero);
        }
    }

    private final HeroesDeck deck = new HeroesDeck();
    private int gold = 500000; // TODO : DONT FORGET TO RESET TO 0

    public int play(int choice) {
        switch (choice) {
            case 1 -> {
                if (gold >= HERO_COST) {
                    gold -= HERO_COST;
                    Hero h = Hero.getRandomHero();
                    System.out.println(h.show());
                    System.out.println("Pièces restantes: " + gold);
                    deck.add(h);
                } else
                    System.out.println("Tu n'as pas assez d'argent (" + gold + " pièces)");
            }
            case 2 -> System.out.println(deck.show());
            case 3 -> {
                Monster m = Monster.createMonster();
                System.out.println(m.show());
                System.out.println(deck.show());
                Hero h = deck.get(Global.get_input("Choisissez un héros (numéro): "));
                int g = fight(h, m);
                if (g == -1) System.out.println(h.getName() + " a perdu... (+0 pièce)");
                else {
                    gold += g;
                    System.out.println(h.getName() + " a gagné ! (+" + g + " pièces)");
                }
                h.getStat().regen();
            }
            case 4 -> {
                return -1;
            }
            default -> System.out.println("Commande incorrecte (1-4)");
        }
        return 0;
    }

}
