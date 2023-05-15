package com.dsa.strivers.step1.designpattern.creational.singleton;

public class LazyInitializationSingleton {

    private static LazyInitializationSingleton dbConnection;

    private LazyInitializationSingleton() { }

    public static LazyInitializationSingleton getSingletonDBConnection() {
        if(dbConnection == null) {
            dbConnection = new LazyInitializationSingleton();
        }
        return dbConnection;
    }


}
