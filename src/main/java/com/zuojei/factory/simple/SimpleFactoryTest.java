package com.zuojei.factory.simple;

import com.zuojei.factory.Telunshu;

/**
 * desc:小作坊式的工厂模型
 * author:zuojie
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        //这个new的过程是一个复杂的过程
       //System.out.println(new Telunshu().getName());
        /**
         * 小作坊式的生产模式
         * 用户不再关心生产的过程，只需要关心结果
         */
        SimpleFactory simpleFactory=new SimpleFactory();
        System.out.println(simpleFactory.getMilk("特伦舒"));
    }
}
