package com.zuojei.factory.func;

/**
 * authorz;zuojie
 */
public class FactoryTest {
    public static void main(String[] args) {
        //MenglunFactory menglunFactory=new MenglunFactory();
        Factory factory = new XiaofanpaiFactory();
        System.out.println(factory.getMilk().getName());

    }
}
