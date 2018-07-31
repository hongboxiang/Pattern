package com.pattarn.singleton;

/**
 * Created on 2018/3/12
 */
public class Auto {
    private static Auto ourInstance = new Auto();

    public static Auto getInstance() {
        return ourInstance;
    }

    private Auto() {
        System.out.println("≥ı ºªØ");
    }
}
