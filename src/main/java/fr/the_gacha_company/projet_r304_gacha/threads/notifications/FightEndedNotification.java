package fr.the_gacha_company.projet_r304_gacha.threads.notifications;

/**
 * Class that extend Notification and that might be use in the future to notify the player of the end of a fight
 */
public class FightEndedNotification extends Notification {
    /**
     * Constructor of FightEndedNotification
     * @param manager the manager of FightEndedNotification
     */
    public FightEndedNotification(NotificationManager manager) {
        super(manager, null);
    }

}
