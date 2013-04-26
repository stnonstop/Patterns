package com.gg.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 3:25 PM
 */
public class TxProxyCommand implements InvocationHandler {
    private Object target;

    public TxProxyCommand(Object target){
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        try{
            System.out.println("tx begin");
            Object result = method.invoke(target,objects);
            System.out.println("tx commit");
            return result;
        } catch (Exception e) {
            System.out.println("tx rollback");
            throw new RuntimeException(e);
        }
    }
}
