package fr.the_gacha_company.projet_r304_gacha.threads.notifications;

import fr.the_gacha_company.projet_r304_gacha.Showable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The class that extend ArrayList<Notification> and implements Showable
 */
public class NotificationManager extends ArrayList<Notification> implements Showable {
    /**
     * read the newest notification
     * @return return the new minimalShow
     */
    public String read() {
        String s = "Nouveauté(s) :\n" + minimalShow();
        clear();
        return s;
    }

    /**
     * create a string that is the minimalShow of an interface that the player can see in the terminal
     * @return the minimalShow string
     */
    @Override
    public String minimalShow() {
        StringBuilder sb = new StringBuilder();
        for (Iterator<Notification> it=iterator(); it.hasNext();)
            sb.append(it.next().getMessage()).append('\n');
        sb.deleteCharAt(sb.length()-1);     // delete last '\n'
        return sb.toString();
    }

    /**
     * create a string that is the Show of an interface that the player can see in the terminal
     * @return the show
     */
    @Override
    public String show() {
        return null;
    }
}