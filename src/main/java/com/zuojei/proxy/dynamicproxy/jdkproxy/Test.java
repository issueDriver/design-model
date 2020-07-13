package com.zuojei.proxy.dynamicproxy.jdkproxy;


import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 */
public class Test {
    private ReentrantLock lock=new ReentrantLock();
    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhangsan = jdkMeipo.getInstance(new ZhangShan());
        zhangsan.findLove();

        byte[] bytes = ProxyGenerator.generateProxyClass("$proxy0", new Class[]{IPerson.class});
        try {
            FileOutputStream os = new FileOutputStream("my-tools");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
