package com.zuojei.proxy.staticproxy;

/**
 * author:zuojie
 */
public class ZhangLaoShan implements IPerson {
    private Zhandshan zhandshan;
    public ZhangLaoShan(Zhandshan zhandshan){
        this.zhandshan=zhandshan;
    }
    public void findLove() {
        System.out.println("开始物色");
        zhandshan.findLove();
        System.out.println("开始交往");
    }
}
