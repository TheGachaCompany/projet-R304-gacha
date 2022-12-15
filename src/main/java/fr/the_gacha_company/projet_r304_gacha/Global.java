package fr.the_gacha_company.projet_r304_gacha;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public final class Global {

    public static final Scanner in = new Scanner(System.in);
    public static final String SEPARATOR = "_".repeat(60);
    public static final Random rand = new Random();

    public static int getInput(String s) throws MyInputException {
        System.out.print(s);
        try {
            int i = in.nextInt();
            in.nextLine();
            System.out.println(SEPARATOR);
            return i;
        } catch (InputMismatchException e) {
            in.nextLine();
            throw new MyInputException();
        }
    }

    public static void pressEnter() {
        System.out.print("\nAppuyez sur <entrée> pour continuer");
        in.nextLine();
        System.out.println(SEPARATOR);
    }

    public static String center(String s, int size) {
        int spaceSum = size - s.length();
        return " ".repeat(spaceSum / 2) + s + " ".repeat(spaceSum / 2 + Math.floorMod(spaceSum, 2));
    }

}