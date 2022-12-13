package fr.the_gacha_company.projet_r304_gacha;

public class Main {

    public static void main(String[] args) {
        Player p = new Player();
        for (int i=0; i<100; ++i) p.play(1);    // TODO : DONT FORGET TO DELETE
        do System.out.println(Player.INSTRUCTIONS);
        while (p.play(Global.get_input("\nInstruction : ")) != -1);
        System.out.println("Jeu fermé.");
    }

}
