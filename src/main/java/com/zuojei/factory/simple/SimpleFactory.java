package com.zuojei.factory.simple;

import com.zuojei.factory.Milk;
import com.zuojei.factory.Telunshu;

/**
 * author;zuojie
 */
public class SimpleFactory {
    public Milk getMilk(String name){
        if("特伦舒".equals(name)){
            return new Telunshu();
        }
        return null;


    }
}
