package com.pattarn.proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Created on 2018/3/9
 */
public class ProxyTest {
    @Test
    public void invokeTest() throws Exception {
        ProxyHandler proxyHandler = new ProxyHandler(new YinSon());
        People people = (People) Proxy.newProxyInstance(YinSon.class.getClassLoader(),YinSon.class.getInterfaces(),proxyHandler);
        people.eat(" ø∂‡∆°¿Ê");
    }
}