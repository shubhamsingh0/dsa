package com.dsa.strivers.step1.designpattern.creational.abstractfactorydesignpattern;

public class NotificationService {

    public static void main(String[] args) {
        NotificationAbstractFactoryProducer producer = new NotificationAbstractFactoryProducer();
        NotificationAbstractFactory notificationAbstractFactory = producer.createNotificationInstance("SMS");
        Notification notification = notificationAbstractFactory.createNotification("AIRTEL");
        notification.sendNotification();

        NotificationAbstractFactory smsNotificationAbstractFactory = producer.createNotificationInstance("SMS");
        Notification twilioNotification = smsNotificationAbstractFactory.createNotification("TWILIO");
        twilioNotification.sendNotification();

        NotificationAbstractFactory pushNotificationAbstractFactory = producer.createNotificationInstance("PUSH");
        Notification snsNotification = pushNotificationAbstractFactory.createNotification("SNS");
        snsNotification.sendNotification();

        NotificationAbstractFactory kafkaPushNotificationAbstractFactory = producer.createNotificationInstance("PUSH");
        Notification kafkaNotification = kafkaPushNotificationAbstractFactory.createNotification("KAFKA");
        kafkaNotification.sendNotification();

    }
}
