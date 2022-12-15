package fr.the_gacha_company.projet_r304_gacha;

/**
 * Gives to classe two simple ways to render them in the terminal
 */
public interface Showable {

    /**
     * Creates the minimal representation of the object
     * @return String representing the minimal render
     */
    String minimalShow();

    /**
     * Creates the representation of the object
     * @return String representing the render
     */
    String show();

}
