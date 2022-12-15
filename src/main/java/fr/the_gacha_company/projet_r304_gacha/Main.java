package fr.the_gacha_company.projet_r304_gacha;

/**
 * the main class of the program
 */
public class Main {
    /**
     * the main methode of the program
     * @param args some args
     */
    public static void main(String[] args) {
        for (int i=0; i<5; ++i) Player.play(1);    // TODO : DONT FORGET TO DELETE
        do System.out.println(Player.showMainMenu());
        while (Player.play(Global.getInput("\nInstruction : ")) != -1);
        // Game end
        System.out.println("Jeu fermé.");
    }

}
