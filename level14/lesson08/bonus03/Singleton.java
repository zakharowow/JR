package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Чеширский on 25.03.2016.
 */
final class Singleton {

    private static Singleton instance = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() {
        return instance;
    }

    /*private static Singleton instance = null;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) return new Singleton();
        else return instance;
    }*/
}
