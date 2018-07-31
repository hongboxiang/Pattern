package com.pattarn.observer;

import java.util.Observable;

/**
 * Created by 10180885 on 15-10-30.
 */
public class Food extends Observable{

    public void strawberryMilk() {
        System.out.println("草莓牛奶已出炉");
        setChanged();
        notifyObservers("草莓牛奶已出炉");
    }

    public void babecue() {
        System.out.println("烤肉已出炉");
        setChanged();
        notifyObservers("烤肉已出炉");
    }
}
