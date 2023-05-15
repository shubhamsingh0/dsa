package com.dsa.strivers.step1.designpattern.creational.abstractfactorydesignpattern;

public class TwilioSmsNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Twilio SMS Notification Sent");
    }
}
