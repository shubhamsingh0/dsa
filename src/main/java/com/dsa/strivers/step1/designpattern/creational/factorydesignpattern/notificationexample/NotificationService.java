package com.dsa.strivers.step1.designpattern.creational.factorydesignpattern.notificationexample;

import java.util.List;

public class NotificationService {

    public static void main(String[] args) {

        // It is the responsibility of factory to generate the concrete class/object.
        // It is used when all the object creation and its business logic we need to keep at one place and hide the creation logic.
        // Problem solves: Remove unnecessary if else condition which is needed to be used throughout the application for creation logic.
        // I have to change only one class i.e. NotificationFactory.Class
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification smsNotification = notificationFactory.createNotification("SMS");
        smsNotification.notifyUser(List.of("8005111333","9877618256"));

        Notification emailNotification = notificationFactory.createNotification("EMAIL");
        emailNotification.notifyUser(List.of("abc@gmail.com","xyz@yahoo.com"));

    }
}
