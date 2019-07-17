package com.panlei.dynaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author pan_l
 * @ClassName MyInvocationHandler
 * @Description
 * @date 2019-07-17 10:17
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理类运行");
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}
