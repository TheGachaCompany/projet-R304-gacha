package fr.the_gacha_company.projet_r304_gacha.threads.notifications;

/**
 * The abstract class that represent the notification system
 */
public abstract class Notification {

    private final NotificationManager manager;
    private final String message;

    /**
     * Constructor of Notification
     * @param manager The manager of Notification
     * @param message The message of Notification
     */
    public Notification(NotificationManager manager, String message) {
        this.manager = manager;
        this.message = message;
    }

    /**
     * get the message
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Notify the manager to show this object on next notification show
     */
    public void trigger() {
        manager.add(this);
    }

}
