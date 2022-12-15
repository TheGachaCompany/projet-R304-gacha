package fr.the_gacha_company.projet_r304_gacha;

public class Main {

    public static void main(String[] args) {
//        for (int i=0; i<50; ++i) Player.play(1);    // TODO : DONT FORGET TO DELETE
        do System.out.println(Player.getOutput());
        while (Player.play(Global.getInput("\nInstruction : ")) != -1);
        System.out.println("Jeu fermé.");
    }

}
