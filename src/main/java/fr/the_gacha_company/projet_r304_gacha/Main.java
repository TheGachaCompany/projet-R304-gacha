package fr.the_gacha_company.projet_r304_gacha;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final Scanner in = new Scanner(System.in);
    public static final Random rand = new Random();

    public static int get_input(String s) {
        System.out.print(s);
        return in.nextInt();
    }

    public static void main(String[] args) {
        Player p = new Player();
        do System.out.println(Player.instructions);
        while (p.play(get_input("\nInstruction : ")) != -1);
        System.out.println("Jeu fermé.");
    }

}
