package fr.the_gacha_company.projet_r304_gacha.threads.notifications;

import fr.the_gacha_company.projet_r304_gacha.heroes.Hero;

public class HeroEndedRegenNotification extends Notification {

    public HeroEndedRegenNotification(NotificationManager manager, Hero h) {
        super(manager, h.getName() + " a regagné tous ses PV (" + h.getStat().getHpMax() + ")");
    }

}
