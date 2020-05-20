package com.zuojei.singleton.test;

import com.zuojei.singleton.Hungry;
import com.zuojei.singleton.LazyTwo;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * 线程安全测试
 * auhtor:zuojie
 */
public class ThreadSafeTest {
    public static void main(String[] args) {
        int count=100;
        final CountDownLatch latch=new CountDownLatch(count);
        final Set<Hungry> syncset= Collections.synchronizedSet(new HashSet<Hungry>());
        long start=System.currentTimeMillis();
        for(int i=0;i<count;i++){
            new Thread(){
                @Override
                public void run() {
                    try {
                        latch.await();
                        // Object object=   LazyOne.getInstance();
                        Object object=   LazyTwo.getInstance();
                        System.out.println(System.currentTimeMillis()+":"+object);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }.start();
            latch.countDown();
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);


    }
}
