package fr.the_gacha_company.projet_r304_gacha;

public class Main {

    public static void main(String[] args) {
        for (int i=0; i<100; ++i) Player.play(1);    // TODO : DONT FORGET TO DELETE
        // Main loop
        do System.out.println(Player.showMainMenu());
        while (Player.play(Global.getInput("\nInstruction : ")) != -1);
        // Game end
        System.out.println("Jeu fermé.");
    }

}
