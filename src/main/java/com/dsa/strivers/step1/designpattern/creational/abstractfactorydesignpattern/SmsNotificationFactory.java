package com.dsa.strivers.step1.designpattern.creational.abstractfactorydesignpattern;

public class SmsNotificationFactory implements NotificationAbstractFactory{
    public Notification createNotification(String notificationType) {
        return switch (notificationType) {
            case "AIRTEL" -> new AirtelSmsNotification();
            case "TWILIO" -> new TwilioSmsNotification();
            default -> null;
        };
    }
}
