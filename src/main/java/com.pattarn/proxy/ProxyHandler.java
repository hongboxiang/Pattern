package com.pattarn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created on 2018/3/9
 */
public class ProxyHandler implements InvocationHandler {
    Object target;

    public ProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke begin");
        method.invoke(target, args);
        System.out.println("method :" + method.getName() + " is invoked!");
        System.out.println("invoke end");
        return null;
    }
}
