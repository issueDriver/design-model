package com.zuojei.singleton.register;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * desc:注册登记式:每使用一次，都往一个固定的容器中去注册并且将使用的对象进行缓存。下次
 * 去取对象的时候，就直接从缓存中取值，以保证每次获取的都是同一对象 IOC中的单例模式就是典型的
 * 注册式单例模式
 *
 */
public class RegisterMap {

    private RegisterMap(){

    }

    public static Map<String,Object> register=new HashMap<String,Object>();
    public static RegisterMap getInstance(String name){
        if(name==null){
            name=RegisterMap.class.getName();
        }
        if(register.get(name)==null){
            try {
                register.put(name,Class.forName(name).getInterfaces());
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        return (RegisterMap) register.get(name);
    }




}
