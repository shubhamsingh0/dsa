package com.dsa.strivers.step1.designpattern.creational.abstractfactorydesignpattern;

import com.dsa.strivers.step1.designpattern.creational.factorydesignpattern.notificationexample.PushNotification;

public class KafkaPushNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Kafka Push Notification Sent");
    }
}
