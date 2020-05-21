package com.zuojei.singleton.serialization;

import java.io.Serializable;

/**
 * desc:序列化与反序列化保证单例 重写readResolve()
 * author:zuojie
 */
public class Seriable implements Serializable {
    public final static Seriable INSTANCE=new Seriable();
    private Seriable(){

    }
    public static Seriable getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){
        System.out.println("read resolve");
        return INSTANCE;
    }
}
