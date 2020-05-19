package com.zuojei.factory.abstrac;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        MIlkFactory mIlkFactory=new MIlkFactory();
        System.out.println(mIlkFactory.getMengniu().getName());

    }
}
