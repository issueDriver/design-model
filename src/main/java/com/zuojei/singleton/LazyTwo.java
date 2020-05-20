package com.zuojei.singleton;

/**
 * 懒汉式 线程安全 使用synchronized 保证线程安全
 * auhtor:zuojie
 */
public class LazyTwo {
    private LazyTwo(){};

    private static LazyTwo lazyTwo=null;

    public static synchronized LazyTwo getInstance(){
        if(lazyTwo==null){
            lazyTwo=new LazyTwo();
        }
        return lazyTwo;
    }
}
