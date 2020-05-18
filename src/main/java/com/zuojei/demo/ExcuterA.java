package com.zuojei.demo;

/**
 * desc：普通员工A开始执行某命令
 */
public class ExcuterA implements IExcuter{

    public void excute(String command) {
        System.out.println("员工A 开始做"+command+"的工作");
    }
}
