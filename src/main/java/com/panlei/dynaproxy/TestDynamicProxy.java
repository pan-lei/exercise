package com.panlei.dynaproxy;

import java.lang.reflect.Proxy;

/**
 * @author pan_l
 * @ClassName TestDynamicProxy
 * @Description 动态代理
 * @date 2019-07-17 10:02
 */
public class TestDynamicProxy {

    public static void main(String[] args) {
        NikeFactory nike = new NikeFactory();
        MyInvocationHandler invocationHandler = new MyInvocationHandler(nike);

        ClothFactory clothFactory = (ClothFactory) Proxy.newProxyInstance(nike.getClass().getClassLoader(),
                nike.getClass().getInterfaces(), invocationHandler);

        int i = clothFactory.count(1);
        System.out.println(i);

    }

}
