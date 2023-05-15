package com.dsa.strivers.step1.designpattern.creational.abstractfactorydesignpattern;

import com.dsa.strivers.step1.designpattern.creational.factorydesignpattern.notificationexample.PushNotification;

public class SnsPushNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("SNS Push Notification Sent");
    }
}
