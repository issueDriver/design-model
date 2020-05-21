package com.zuojei.singleton;

/**
 *
 * Author:zuojie
 */
public class LasyThree {
    private static boolean initialized=false;
    /**
     * 默认使用 lazyThree的时候 会先初始化内部类
     * 如果没使用 内部类是不加载的
     * @return
     */
    private LasyThree(){
        synchronized (LasyThree.class){
            if(initialized==false){
                initialized=!initialized;
            }else {
                throw new RuntimeException("单例已被侵犯");
            }

        }
    }

    public static final LasyThree getInstance(){
        return LazyHoder.lazy;
    }
    private static class LazyHoder{
        private static final LasyThree lazy=new LasyThree();
    }
}
