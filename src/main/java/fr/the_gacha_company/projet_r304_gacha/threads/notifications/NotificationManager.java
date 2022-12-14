package fr.the_gacha_company.projet_r304_gacha.threads.notifications;

import fr.the_gacha_company.projet_r304_gacha.Showable;

import java.util.ArrayList;

public class NotificationManager extends ArrayList<Notification> implements Showable {

    public String read() {
        if (isEmpty()) return "Pas de nouveauté";
        String s = "Nouveauté(s) :" + minimalShow();
        clear();
        return s;
    }

    @Override
    public String minimalShow() {
        StringBuilder sb = new StringBuilder();
        for (Notification n: this)
            sb.append('\n').append(n.getMessage());
        return sb.toString();
    }

    @Override
    public String show() {
        return null;
    }

}