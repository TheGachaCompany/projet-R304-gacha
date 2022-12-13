package fr.the_gacha_company.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.heroes.Hero;

public class Player {

    public static final String instructions = """
            1. Acheter un héros
            2. Mes héros
            3. Combattre
            4. Quitter le jeu""";

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

    private int gold = 0;

    public int play(int choice) {
        switch (choice) {
            case 1:
                deck.add(Hero.get_random_hero());
                break;
            case 2:
                System.out.println(deck.show());
                break;
            case 3:
                Monster m = Monster.createMonster();
                System.out.println(m.show());
                System.out.println(deck.show());
                Hero h = deck.get(Global.get_input("Choisissez un héros (numéro): "));
                int g = fight(h, m);
                if (g == -1) System.out.println(h.getName() + " a perdu... (+0)");
                else {
                    gold += g;
                    System.out.println(h.getName() + " a gagné ! (+" + g + ")");
                }
                h.getStat().regen();
                break;
            case 4:
                return -1;
            default:
                System.out.println("Commande incorrecte (1-4)");
        }
        return 0;
    }

}
