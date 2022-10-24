package org.example.CoR;

public class SmsNotifier extends Notifier {

    public SmsNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String msg) {
        System.out.println("Оповощение с помощью sms: " + msg);
    }
}
