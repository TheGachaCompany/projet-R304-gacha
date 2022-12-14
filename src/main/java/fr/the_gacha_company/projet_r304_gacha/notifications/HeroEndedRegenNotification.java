package fr.the_gacha_company.projet_r304_gacha.notifications;

import fr.the_gacha_company.projet_r304_gacha.heroes.Hero;

public class HeroEndedRegenNotification extends Notification {

    public HeroEndedRegenNotification(Hero h) {
        super(h.getName() + " a regagné tous ses PV (" + h.getStat().getHp() + ")");
    }

}
