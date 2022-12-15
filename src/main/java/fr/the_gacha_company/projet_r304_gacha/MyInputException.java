package fr.the_gacha_company.projet_r304_gacha;

import java.util.InputMismatchException;

public class MyInputException extends InputMismatchException {

    public MyInputException() {
        super("Entrée invalide");
    }

}
