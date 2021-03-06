package com.zuojei.singleton;

/**
 * 饿汉式
 * author:zuojie
 */
public class Hungry {

    private Hungry(){}

    private static final Hungry hungry=new Hungry();

    public static Hungry getInstance(){
        System.out.println(System.currentTimeMillis()+":"+hungry);
        return hungry;
    }
}
