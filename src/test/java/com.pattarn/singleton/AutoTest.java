package com.pattarn.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018/3/13
 */
public class AutoTest {

    @Test
    public void testStatic() throws InterruptedException {
        System.out.println("start Auto.getInstance");
        Auto.getInstance();
    }

    @Test
    public void testEnum() {
        EnumSingleton.INSTANCE.gan();
    }
}