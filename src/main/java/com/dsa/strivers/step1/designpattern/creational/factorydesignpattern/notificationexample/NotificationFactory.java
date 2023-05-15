package com.dsa.strivers.step1.designpattern.creational.factorydesignpattern.notificationexample;

public class NotificationFactory {

    public Notification createNotification(String channel) {

        return switch (channel) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            case "PUSH" -> new PushNotification();
            default -> null;
        };
    }
}
