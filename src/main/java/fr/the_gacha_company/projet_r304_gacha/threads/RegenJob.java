package fr.the_gacha_company.projet_r304_gacha.threads;

import fr.the_gacha_company.projet_r304_gacha.heroes.Hero;
import fr.the_gacha_company.projet_r304_gacha.threads.notifications.HeroEndedRegenNotification;

public class RegenJob implements Runnable {

    private final Hero hero;
    private final HeroEndedRegenNotification notification;

    public RegenJob(Hero hero, HeroEndedRegenNotification notification) {
        this.hero = hero;
        this.notification = notification;
    }

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
        System.out.println("FINI");
        notification.trigger();
    }

}
