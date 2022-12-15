package fr.the_gacha_company.projet_r304_gacha.threads.notifications;

import fr.the_gacha_company.projet_r304_gacha.Showable;

import java.util.ArrayList;
import java.util.Iterator;

public class NotificationManager extends ArrayList<Notification> implements Showable {

    public String read() {
        String s = "Nouveauté(s) :\n" + minimalShow();
        clear();
        return s;
    }

    @Override
    public String minimalShow() {
        StringBuilder sb = new StringBuilder();
        for (Iterator<Notification> it=iterator(); it.hasNext();)
            sb.append(it.next().getMessage()).append('\n');
        sb.deleteCharAt(sb.length()-1);     // delete last '\n'
        return sb.toString();
    }

    @Override
    public String show() {
        return null;
    }

}