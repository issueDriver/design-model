package com.zuojei.demo;

/**
 * desc:普通员工B开始执行某命令
 */
public class ExcuterB implements IExcuter{
    public void excute(String command) {
        System.out.println("员工B 开始做"+command+"的工作");
    }
}
