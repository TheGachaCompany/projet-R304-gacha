package fr.the_gacha_company.projet_r304_gacha;

import java.util.Random;
import java.util.Scanner;

public class Global {

    public static final Scanner in = new Scanner(System.in);
    public static final Random rand = new Random();

    public static int get_input(String s) {
        System.out.print(s);
        return in.nextInt();
    }

    public static String center(String s, int size) {
        int spaceSum = size - s.length();
        return " ".repeat(spaceSum / 2) + s + " ".repeat(spaceSum / 2 + Math.floorMod(spaceSum, 2));
    }

}