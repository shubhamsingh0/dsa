package com.dsa.strivers.step1.designpattern.creational.abstractfactorydesignpattern;

public class AirtelSmsNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Airtel SMS Notification Sent");
    }
}
