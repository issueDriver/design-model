package com.zuojei.singleton;

import java.lang.reflect.Constructor;

public class LazyThreeTest {
    public static void main(String[] args) {
        try{
            Class<?> clazz = LasyThree.class;
            //可以获取所有构造函数，但是不包括父类。
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor c:constructors){
                //用反射强制访问
                c.setAccessible(true);
                Object o = c.newInstance();

            }



        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
