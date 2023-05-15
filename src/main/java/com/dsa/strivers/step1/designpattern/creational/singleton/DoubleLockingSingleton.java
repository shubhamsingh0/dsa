package com.dsa.strivers.step1.designpattern.creational.singleton;

public class DoubleLockingSingleton {

    private static DoubleLockingSingleton dbConnection;

    private DoubleLockingSingleton() {}

    public static DoubleLockingSingleton getSingletonDBConnection() {
        if(dbConnection == null) {
            synchronized (DoubleLockingSingleton.class) {
                if(dbConnection == null) {
                    dbConnection = new DoubleLockingSingleton();
                }
            }
        }
        return dbConnection;
    }
}
