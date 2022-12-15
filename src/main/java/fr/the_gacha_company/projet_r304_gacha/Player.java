package fr.the_gacha_company.projet_r304_gacha;

import fr.the_gacha_company.projet_r304_gacha.heroes.Hero;
import fr.the_gacha_company.projet_r304_gacha.threads.notifications.NotificationManager;

public final class Player {

    public static final String INSTRUCTIONS = """
            1. Acheter un héros
            2. Mes héros
            3. Combattre
            4. Quitter le jeu""";
    public static final int HERO_COST = 200;
    public static final NotificationManager notificationManager = new NotificationManager();

    private static void fight(Hero hero, Monster monster) {
        if (monster.getStat().getSpeed()>hero.getStat().getSpeed())
            monster.attack(hero);
        while (true) {
            if (hero.getStat().isDead()) {
                System.out.println(hero.getName() + " a perdu... (+0 pièce, +0 exp)");
                return;
            }
            hero.attack(monster);
            if (monster.getStat().isDead()) {
                coins += monster.getCoinsValue();
                hero.gainXp(monster.getXpValue());
                System.out.println(hero.getName() + " a gagné ! (+" + monster.getCoinsValue() + " pièces, +" + monster.getXpValue() + " exp)");
                return;
            }
            monster.attack(hero);
        }
    }
    private static final HeroesDeck deck = new HeroesDeck();
    private static int coins = 500000; // TODO : DONT FORGET TO RESET TO 0

    public static String getOutput() {
        StringBuilder sb = new StringBuilder();
        if (!notificationManager.isEmpty()) sb.append(notificationManager.read()).append("\n\n");
        sb.append(INSTRUCTIONS);
        return sb.toString();
    }

    public static int play(int choice) throws MyInputException {
        switch (choice) {
            case 1 -> {
                if (coins >= HERO_COST) {
                    coins -= HERO_COST;
                    Hero h = Hero.getRandomHero();
                    deck.add(h);
                    System.out.println(h.show());
                } else
                    System.out.println("Tu n'as pas assez d'argent (" + coins + " pièces)");
                Global.pressEnter();
            }
            case 2 -> {
                System.out.println(deck.show());
                Global.pressEnter();
            }
            case 3 -> {
                Monster m = Monster.createMonster();
                System.out.println(m.show() + "\n\n" + deck.show() + '\n');
                Hero h = deck.get(Global.getInput("Choisissez un héros (numéro): "));
                fight(h, m);
                h.startRegenThread(notificationManager);
                Global.pressEnter();
            }
            case 4 -> {
                return -1;
            }
            default -> throw new MyInputException();
        }
        return 0;
    }
}
