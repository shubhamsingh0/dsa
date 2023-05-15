package com.dsa.strivers.step1.designpattern.creational.singleton;

public class SynchronizedMethodSingleton {
    private static SynchronizedMethodSingleton dbConnection;

    private SynchronizedMethodSingleton() {}

    public synchronized static SynchronizedMethodSingleton getSingletonDBConnection() {

        if(dbConnection == null) {
           dbConnection =  new SynchronizedMethodSingleton();
        }
        return dbConnection;
    }
}
