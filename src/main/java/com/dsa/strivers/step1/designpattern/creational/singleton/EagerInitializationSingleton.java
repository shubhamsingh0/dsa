package com.dsa.strivers.step1.designpattern.creational.singleton;

public class EagerInitializationSingleton {

    private static EagerInitializationSingleton dbConnection = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {
    }

    public static EagerInitializationSingleton getSingletonDBConnection() {
        return dbConnection;
    }

}
