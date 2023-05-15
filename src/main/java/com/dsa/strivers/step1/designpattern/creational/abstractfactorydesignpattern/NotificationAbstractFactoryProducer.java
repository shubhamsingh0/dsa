package com.dsa.strivers.step1.designpattern.creational.abstractfactorydesignpattern;

import com.dsa.strivers.step1.designpattern.creational.factorydesignpattern.notificationexample.SMSNotification;

public class NotificationAbstractFactoryProducer {
    public NotificationAbstractFactory createNotificationInstance(String notificationType) {
        return switch (notificationType) {
            case "SMS" -> new SmsNotificationFactory();
            case "PUSH" -> new PushNotificationFactory();
            default -> null;
        };
    }
}
