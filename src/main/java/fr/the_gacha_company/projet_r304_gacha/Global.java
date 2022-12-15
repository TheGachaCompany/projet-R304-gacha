package fr.the_gacha_company.projet_r304_gacha;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Global attributes and methods that can be accessed everywhere
 */
public final class Global {

    public static final Scanner in = new Scanner(System.in);
    public static final String SEPARATOR = "_".repeat(60);
    public static final Random rand = new Random();

    /**
     * Gets an int from user. Can never fail because it asks until a correct value is given.
     * @param s a String representing displayed instructions for user
     * @return an int representing the first correct user input
     */
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

    /**
     * Waits until user finish an input
     */
    public static void pressEnter() {
        System.out.print("\nAppuyez sur <entrée> pour continuer");
        in.nextLine();
        System.out.println(SEPARATOR);
    }

    /**
     * Centers a String in a size chars spaces
     * @param s a String to center
     * @param size an int representing the total requested size
     * @return a String representing the // TODO
     */
    public static String center(String s, int size) {
        int spaceSum = size - s.length();
        return " ".repeat(spaceSum / 2) + s + " ".repeat(spaceSum / 2 + Math.floorMod(spaceSum, 2));
    }

}