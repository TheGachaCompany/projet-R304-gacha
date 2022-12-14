package fr.the_gacha_company.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.heroes.Hero;
import fr.the_gacha_company.projet_r304_gacha.threads.notifications.NotificationManager;

/**
 * Holds the methods to interact in the game.
 */
public final class Player {

    public static final String INSTRUCTIONS = """
            1. Acheter un héros
            2. Mes héros
            3. Combattre
            4. Quitter le jeu""";
    public static final int HERO_COST = 200;
    public static final NotificationManager notificationManager = new NotificationManager();

    /**
     * Realize a fight against a Hero and a Monster
     * @param hero a Hero
     * @param monster a Monster
     * @return an int representing the coins gain if the hero wons the fight, else -1
     */
    private static int fight(Hero hero, Monster monster) {
        // monster attacks first if he has more speed
        if (monster.getStat().getSpeed()>hero.getStat().getSpeed())
            monster.attack(hero);
        while (true) {
            // hero died ? No -> attack !
            if (hero.getStat().isDead()) return -1;
            hero.attack(monster);
            // monster died ? No -> attack !
            if (monster.getStat().isDead()) return monster.getCoinsValue();
            monster.attack(hero);
        }
    }
    private static final HeroesDeck deck = new HeroesDeck();
    private static int coins = 500000; // TODO : DONT FORGET TO RESET TO 0

    /**
     * Obtain the displayable main menu, with notifications (if any) and the instructions to show user's possibilities
     * @return a String representing the displayable main menu
     */
    public static String showMainMenu() {
        StringBuilder sb = new StringBuilder();
        if (!notificationManager.isEmpty()) sb.append(notificationManager.read()).append("\n\n");
        sb.append(INSTRUCTIONS);
        return sb.toString();
    }

    /**
     * Execute user choice
     * @param choice an int representing user choice based on INSTRUCTIONS
     * @return an int: -1 if quitting else 0
     * @see #INSTRUCTIONS
     */
    public static int play(int choice) {
        switch (choice) {
            case 1 -> {
                if (coins >= HERO_COST) {
                    // buy a hero
                    coins -= HERO_COST;
                    Hero h = Hero.getRandomHero();
                    System.out.println(h.show());
                    deck.add(h);
                } else
                    System.out.println("Tu n'as pas assez d'argent (" + coins + " pièces)");
                Global.pressEnter();
            }
            case 2 -> {
                // display player's heroes
                System.out.println(deck.show());
                Global.pressEnter();
            }
            case 3 -> {
                Monster m = Monster.createMonster();
                System.out.println(m.show() + "\n\n" + deck.show() + '\n');
                Hero h = deck.get(Global.getInput("Choisissez un héros (numéro): "));
                // start fight
                int c = fight(h, m);
                if (c == -1) System.out.println(h.getName() + " a perdu... (+0 pièce)");
                else {
                    coins += c;
                    System.out.println(h.getName() + " a gagné ! (+" + c + " pièces)");
                }
                // start hero regeneration
                h.startRegenThread(notificationManager);
                Global.pressEnter();
            }
            case 4 -> {
                return -1;
            }
            default -> System.out.println("Commande incorrecte (1-4)");
        }
        return 0;
    }
}
