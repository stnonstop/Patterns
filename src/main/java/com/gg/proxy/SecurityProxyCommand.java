package com.gg.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 3:30 PM
 */
public class SecurityProxyCommand implements InvocationHandler {

    private Object target;

    public SecurityProxyCommand(Object target){
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("Personel sadece kendisi tarafından güncellenebilir");
        Object result = method.invoke(target,objects);
        return result;
    }
}
