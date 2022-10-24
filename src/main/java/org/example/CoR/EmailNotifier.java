package org.example.CoR;

public class EmailNotifier extends Notifier {

    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String msg) {
        System.out.println("Оповощение с помощью email: " + msg);
    }
}
