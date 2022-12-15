package fr.the_gacha_company.projet_r304_gacha.threads.notifications;

import fr.the_gacha_company.projet_r304_gacha.heroes.Hero;

/**
 * Class that extend Notification and that is used to notify the player that a hero as finished regen
 */
public class HeroEndedRegenNotification extends Notification {
    /**
     * Constructor of HeroEndedRegenNotification
     * @param manager the manager of HeroEndedRegenNotification
     * @param h the hero of HeroEndedRegenNotification
     */
    public HeroEndedRegenNotification(NotificationManager manager, Hero h) {
        super(manager, h.getName() + " a regagné tous ses PV (" + h.getStat().getHpMax() + ")");
    }

}
