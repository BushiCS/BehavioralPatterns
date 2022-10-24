package org.example.CoR;

public abstract class Notifier {
    private final int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String msg, int lvl) {
        if (lvl >= priority) {
            write(msg);
        }
        if (nextNotifier != null) {
            nextNotifier.notifyManager(msg, lvl);
        }
    }

    public abstract void write(String msg);
}
