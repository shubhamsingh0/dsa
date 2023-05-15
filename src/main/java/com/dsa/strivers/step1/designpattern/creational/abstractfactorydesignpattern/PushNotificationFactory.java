package com.dsa.strivers.step1.designpattern.creational.abstractfactorydesignpattern;

public class PushNotificationFactory implements NotificationAbstractFactory{

    public Notification createNotification(String notificationType) {
        return switch (notificationType) {
            case "SNS" -> new SnsPushNotification();
            case "KAFKA" -> new KafkaPushNotification();
            default -> null;
        };
    }
}
