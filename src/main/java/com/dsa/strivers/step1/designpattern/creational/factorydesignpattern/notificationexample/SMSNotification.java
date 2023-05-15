package com.dsa.strivers.step1.designpattern.creational.factorydesignpattern.notificationexample;

import java.util.List;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser(List<String> userList) {
        System.out.println("SMS Notification sent to: ");
        userList.forEach(System.out::println);
    }

}
