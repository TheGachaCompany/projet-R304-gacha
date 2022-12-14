package fr.the_gacha_company.projet_r304_gacha;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public final class Global {

    public static final Scanner in = new Scanner(System.in);
    public static final Random rand = new Random();

    public static int get_input(String s) {
        while (true) {
            System.out.print(s);
            try {return in.nextInt();}
            catch (InputMismatchException e) {
                in.nextLine();
                System.out.println("Entrée invalide, réessayez");
            }
        }
    }

    public static String center(String s, int size) {
        int spaceSum = size - s.length();
        return " ".repeat(spaceSum / 2) + s + " ".repeat(spaceSum / 2 + Math.floorMod(spaceSum, 2));
    }

}