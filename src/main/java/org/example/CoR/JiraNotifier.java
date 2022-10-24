package org.example.CoR;

public class JiraNotifier extends Notifier {

    public JiraNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String msg) {
        System.out.println("Оповещение менеджера с помощью уведомления в Jira: " + msg);
    }
}
