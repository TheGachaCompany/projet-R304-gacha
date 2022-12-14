package fr.the_gacha_company.projet_r304_gacha.threads.notifications;

public abstract class Notification {

    private final NotificationManager manager;
    private final String message;

    public Notification(NotificationManager manager, String message) {
        this.manager = manager;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void trigger() {
        manager.add(this);
    }

}
