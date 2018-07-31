package com.pattarn.proxy;

/**
 * Created on 2018/3/9
 */
public class YinSon implements People {
    @Override
    public void eat(String food) {
        System.out.println("YinSon eat: " + food);
    }
}
