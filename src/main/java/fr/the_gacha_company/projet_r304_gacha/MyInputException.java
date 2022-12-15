package fr.the_gacha_company.projet_r304_gacha;

import java.util.InputMismatchException;

/**
 * Class that extends InputMismatchException that create an exception when there is a wrong input
 */
public class MyInputException extends InputMismatchException {
    /**
     * Constructor of MyInputException
     */
    public MyInputException() {
        super("Entrée invalide");
    }

}
