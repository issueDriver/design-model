package com.zuojei.factory.func;

import com.zuojei.factory.Milk;
import com.zuojei.factory.Telunshu;

/**
 * auhtor:zuojie
 */
public class TelunsuFactory implements Factory {
    public Milk getMilk() {
        return new Telunshu();
    }
}
