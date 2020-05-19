package com.zuojei.factory.func;

import com.zuojei.factory.Menglun;
import com.zuojei.factory.Milk;

/**
 * auhtor:zupjie
 */
public class MenglunFactory implements Factory {
    public Milk getMilk() {
        return new Menglun();
    }
}
