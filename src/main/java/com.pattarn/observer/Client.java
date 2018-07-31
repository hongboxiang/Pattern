package com.pattarn.observer;

import java.util.Observer;

/**
 * Created by 10180885 on 15-10-30.
 */
public class Client {
    public static void main(String[] args) {

        Food food = new Food();

        food.addObserver(new Yinson());
        food.addObserver(new Shenle());

        food.strawberryMilk();
        food.babecue();

    }
}
