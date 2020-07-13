package com.zuojei.proxy.dynamicproxy.jdkproxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * author:zuojie
 */
public class JdkMeipo implements InvocationHandler {
    private IPerson target;
    public IPerson getInstance(IPerson target){
        this.target=target;
        Class<?> aClass = target.getClass();
        return (IPerson) Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),this);

    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }

    private void after() {
        System.out.println("双方同意开始交往");
    }

    private void before() {
        System.out.println("我是媒婆,已经收集到你的需求开始物色");
    }
}
