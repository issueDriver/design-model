package com.zuojei.proxy.dynamicproxy.cglibproxy;

/**
 * auhtor:zuojie
 */
public class Test {
    public static void main(String[] args) {
        ZhangShan zhangShan = (ZhangShan) new CglibMeipo().getInstance(ZhangShan.class);
        zhangShan.findLove();
    }
}
