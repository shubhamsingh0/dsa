package com.dsa.strivers.step1.designpattern.creational.singleton;

public class Service {
    public static void main(String[] args) {
        // at the time of class load time we create an object.
        System.out.println(EagerInitializationSingleton.getSingletonDBConnection().hashCode());
        // instead of load time, we create an object when needed.
        // Problem: 2 thread come simultaneous and both creates object.
        System.out.println(LazyInitializationSingleton.getSingletonDBConnection().hashCode());
        // Above problem is solved by Synchronized but is very expensive as locking is done every time
        System.out.println(SynchronizedMethodSingleton.getSingletonDBConnection().hashCode());
        // Above problem is solved by Double locking
        System.out.println(DoubleLockingSingleton.getSingletonDBConnection().hashCode());
        System.out.println("---------------------");
        System.out.println(EagerInitializationSingleton.getSingletonDBConnection().hashCode());
        System.out.println(LazyInitializationSingleton.getSingletonDBConnection().hashCode());
        System.out.println(SynchronizedMethodSingleton.getSingletonDBConnection().hashCode());
        System.out.println(DoubleLockingSingleton.getSingletonDBConnection().hashCode());
    }
}
