package fr.the_gacha_company.projet_r304_gacha;

import java.util.HashSet;
import java.util.Set;

public final class Player {

    public static final String instructions = """
            1. Acheter un héros
            2. Mes héros
            3. Combattre
            4. Quitter le jeu""";

    private final Set<Hero> heroes = new HashSet<>();

    public int play(int choice) {
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                return -1;
            default:
                System.out.println("Commande incorrecte (1-4)");
        }
        return 0;
    }

}
