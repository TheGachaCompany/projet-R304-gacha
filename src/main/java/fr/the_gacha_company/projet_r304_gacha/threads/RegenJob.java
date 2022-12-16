package fr.the_gacha_company.projet_r304_gacha.threads;

import fr.the_gacha_company.projet_r304_gacha.heroes.Hero;
import fr.the_gacha_company.projet_r304_gacha.threads.notifications.HeroEndedRegenNotification;

/**
 * The class that implement Runnable and take care of the regen of heroes
 */
public class RegenJob implements Runnable {

    private final Hero hero;
    private final HeroEndedRegenNotification notification;

    /**
     * Constructor of RegenJob
     * @param hero the hero of RegenJob
     * @param notification the notification of RegenJob
     */
    public RegenJob(Hero hero, HeroEndedRegenNotification notification) {
        this.hero = hero;
        this.notification = notification;
    }

    /**
     * The method that take care of increasing the hp of the hero until it reach max hp
     */
    @Override
    public void run() {
        while (!hero.getStat().isFull()) {
            // regen 1 hp each 2 seconds
            try {Thread.sleep(2000);}
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hero.getStat().regen1Hp();
        }
        notification.trigger();
    }

}
