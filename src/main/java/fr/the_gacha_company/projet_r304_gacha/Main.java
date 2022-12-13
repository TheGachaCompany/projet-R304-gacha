package fr.the_gacha_company.projet_r304_gacha;

public class Main {

    public static void main(String[] args) {
        Player p = new Player();
        do System.out.println(Player.instructions);
        while (p.play(Global.get_input("\nInstruction : ")) != -1);
        System.out.println("Jeu fermé.");
    }

}
