package com.zuojei.factory.func;

import com.zuojei.factory.Milk;
import com.zuojei.factory.xiaofan;

/**
 * author:zuojie
 */
public class XiaofanpaiFactory implements Factory {
    public Milk getMilk() {
        return new xiaofan();
    }
}
